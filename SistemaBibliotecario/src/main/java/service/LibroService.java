/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import connection.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LibroModel;

/**
 *
 * @author Hamer
 */
public class LibroService implements ICrudService<LibroModel> {
    
    MySqlConnection conexion = new MySqlConnection();
    
    @Override
    public void insertInto(LibroModel entity) {
        String sql = "INSERT INTO libro(titulo, sinopsis, url_image, isb, anio_publicacion, id_autor, id_editorial) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, entity.getTitulo());
            statement.setString(2, entity.getSinopsis());
            statement.setString(3, entity.getUrlImage());
            statement.setString(4, entity.getIsbn());
            statement.setString(5, entity.getAnioPublicacion().toString());
            statement.setInt(6, entity.getIdAutor());
            statement.setInt(7, entity.getIdEditorial());

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Libro insertedo existosamente!");
        } catch (SQLException e) {
            e.printStackTrace();
            
        } 
    }

    @Override
    public LibroModel selectById(int id) {
        String sql = "SELECT * FROM libro WHERE id = ?;";
        
        LibroModel libro = new LibroModel();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
    
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            String anioPublicacionStr = resultSet.getString("anio_publicacion");
            // Convertir la cadena a Date usando SimpleDateFormat
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy"); // Ajusta el formato según cómo se almacene en la base de datos
            Date anioPublicacionDate = dateFormat.parse(anioPublicacionStr);
            libro.setId(resultSet.getInt("id"));
            libro.setTitulo(resultSet.getString("titulo"));
            libro.setSinopsis(resultSet.getString("sinopsis"));
            libro.setUrlImage(resultSet.getString("url_image"));
            libro.setIsbn(resultSet.getString("isb"));
            libro.setAnioPublicacion(anioPublicacionDate);
            libro.setIdAutor(resultSet.getInt("id_autor"));
            libro.setIdEditorial(resultSet.getInt("id_editorial"));
                
           
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(LibroService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (resultSet != null) {
                resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
        return libro;
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE * FROM libro WHERE id = ?;";
        /*try{
        }catch(SQLException e){
        }*/
    }

    @Override
    public void update(int id, LibroModel entity) {
        String sql = "UPDATE libro SET WHERE id = ?";
    }

    @Override
    public List<LibroModel> search(String keyword) {
        String sql = "SELECT ";
        List<LibroModel> libros = new ArrayList<LibroModel>();
        return libros;
    }

   
    
    @Override
    public List<LibroModel> selectAll() {
        String sql = "SELECT * FROM libro;";
        List<LibroModel> libros = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
    
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                String anioPublicacionStr = resultSet.getString("anio_publicacion");
                // Convertir la cadena a Date usando SimpleDateFormat
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy"); // Ajusta el formato según cómo se almacene en la base de datos
                Date anioPublicacionDate = dateFormat.parse(anioPublicacionStr);
                LibroModel libro = new LibroModel();
                libro.setId(resultSet.getInt("id"));
                libro.setTitulo(resultSet.getString("titulo"));
                libro.setSinopsis(resultSet.getString("sinopsis"));
                libro.setUrlImage(resultSet.getString("url_image"));
                libro.setIsbn(resultSet.getString("isb"));
                libro.setAnioPublicacion(anioPublicacionDate);
                libro.setIdAutor(resultSet.getInt("id_autor"));
                libro.setIdEditorial(resultSet.getInt("id_editorial"));
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(LibroService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (resultSet != null) {
                resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
        return libros;
    }

}
