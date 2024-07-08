/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import model.ComentarioModel;
import model.LibroModel;

/**
 *
 * @author Hamer
 */
public class CommentDAO implements ICrudService<ComentarioModel> {
    private MySqlConnection conexion = new MySqlConnection();
    private UserDAO userDAO;
    private BookDAO bookDAO;

    public CommentDAO(UserDAO userDAO, BookDAO bookDAO) {
        this.userDAO = userDAO;
        this.bookDAO = bookDAO;
    }
    
    @Override
    public List<ComentarioModel> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertInto(ComentarioModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ComentarioModel selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ComentarioModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ComentarioModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public List<ComentarioModel> selectByIdOfBook(int id) {
        List<ComentarioModel> comments = new ArrayList<>();
        
        String sql = "SELECT * FROM comentarios WHERE id_book = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                ComentarioModel comentario = new ComentarioModel();
                comentario.setId(resultSet.getInt("id"));
                comentario.setContenido(resultSet.getString("contenido"));
                comentario.setLibro(bookDAO.selectById(resultSet.getInt("id_book")));
                comentario.setUsuario(userDAO.selectById(resultSet.getInt("id_user")));
                comments.add(comentario);
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
        
        return comments;
    }
    
}
