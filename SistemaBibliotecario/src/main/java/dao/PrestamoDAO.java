/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.LibroModel;
import model.PrestamoModel;
import model.UsuarioModel;
import service.AutorService;
import service.EditorialService;
import service.LibroService;
import service.UserService;

/**
 *
 * @author Hamer
 */
public class PrestamoDAO implements ICrudService<PrestamoModel> {
    private MySqlConnection conexion = new MySqlConnection();
    //private LibroService bookService;
    //private UserService userService;
    private BookDAO bookDAO;
    private UserDAO userDAO;
    
    private LibroModel book;
    private UsuarioModel user;
    //private AutorService autorService = new AutorService(new AutorDAO());
    //private EditorialService editorialService = new EditorialService(new EditorialDAO());
    
    public PrestamoDAO(){
       
    }

    public PrestamoDAO(BookDAO bookDAO, UserDAO userDAO) {
        this.bookDAO = bookDAO;
        this.userDAO = userDAO;
    }
    
    
    @Override
    public List<PrestamoModel> selectAll() {
        String sql = "SELECT * FROM prestamo;";
        List<PrestamoModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        //bookService = new LibroService(new BookDAO());
        //userService = new UserService(new UserDAO()); 
    
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                
                PrestamoModel prestamo = new PrestamoModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
    
        return prestamos;
    }

    @Override
    public void insertInto(PrestamoModel entity) {
        String sql = "INSERT INTO prestamo(cantidad, fecha_prestamo, fecha_devolucion, id_book, id_user) VALUES (?,?,?,?,?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, entity.getCantidad());
            statement.setDate(2, entity.getFechaPrestamo());
            statement.setDate(3, entity.getFechaDevolucion());
            statement.setInt(4, entity.getLibro().getId());
            statement.setInt(5, entity.getUsuario().getId());
            

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Prestamo insertedo existosamente!");
        } catch (SQLException e) {
            e.printStackTrace();
            
        } 
    }

    @Override
    public PrestamoModel selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(PrestamoModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PrestamoModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public List<PrestamoModel> selectByIdOfUser(int id) {
        String sql = "SELECT * FROM prestamo WHERE id_user = ?;";
        
        List<PrestamoModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
      
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                
                PrestamoModel prestamo = new PrestamoModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                prestamos.add(prestamo);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
    
        return prestamos;
    }
    
     public List<PrestamoModel> selectByIdOfBook(int id) {
        String sql = "SELECT * FROM prestamo WHERE id_book = ?;";
        
        List<PrestamoModel> prestamos = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
      
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                
                PrestamoModel prestamo = new PrestamoModel();
                prestamo.setId(resultSet.getInt("id"));
                prestamo.setCantidad(resultSet.getInt("cantidad"));
                prestamo.setFechaPrestamo(resultSet.getDate("fecha_prestamo"));
                prestamo.setFechaDevolucion(resultSet.getDate("fecha_devolucion"));
                prestamo.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                prestamo.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                prestamos.add(prestamo);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
    
        return prestamos;
    }
    
}
