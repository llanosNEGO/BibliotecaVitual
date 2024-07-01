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
import java.util.List;
import model.AutorModel;

/**
 *
 * @author Hamer
 */
public class AutorDAO implements ICrudService<AutorModel> {
    MySqlConnection conexion = new MySqlConnection();
    @Override
    public List<AutorModel> selectAll() {
        String sql = "SELECT * FROM autor;";
        List<AutorModel> authors = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                AutorModel author = new AutorModel();
                author.setId(resultSet.getInt("id"));
                author.setNombre(resultSet.getString("nombre"));
                authors.add(author);
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
    
        return authors;
    }

    @Override
    public void insertInto(AutorModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AutorModel selectById(int id) {
        String sql = "SELECT * FROM autor WHERE id = ?;";
        
        AutorModel autor = new AutorModel();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
    
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
        if (resultSet.next()) { // Check if there is a result
            autor = new AutorModel(); // Initialize the autor object if there is a result
            autor.setId(resultSet.getInt("id"));
            autor.setNombre(resultSet.getString("nombre"));
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
    
        return autor;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int id, AutorModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AutorModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
