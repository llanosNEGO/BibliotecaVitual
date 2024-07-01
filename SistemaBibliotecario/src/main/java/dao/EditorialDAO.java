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
import model.EditorialModel;

/**
 *
 * @author Hamer
 */
public class EditorialDAO implements ICrudService<EditorialModel> {
    MySqlConnection conexion = new MySqlConnection();
    
    @Override
    public List<EditorialModel> selectAll() {
        String sql = "SELECT * FROM editorial;";
        List<EditorialModel> editorials = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                EditorialModel editorial = new EditorialModel();
                editorial.setId(resultSet.getInt("id"));
                editorial.setNombre(resultSet.getString("nombre"));
                editorials.add(editorial);
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
    
        return editorials;
    }

    @Override
    public void insertInto(EditorialModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EditorialModel selectById(int id) {
        
        String sql = "SELECT * FROM editorial WHERE id = ?;";
        EditorialModel editorial = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
    
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
        if (resultSet.next()) { 
            editorial = new EditorialModel(); 
            editorial.setId(resultSet.getInt("id"));
            editorial.setNombre(resultSet.getString("nombre"));
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
        
        return editorial;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(int id, EditorialModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EditorialModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
