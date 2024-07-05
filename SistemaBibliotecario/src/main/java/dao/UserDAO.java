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
import java.util.HashSet;
import java.util.List;
import model.UsuarioModel;

/**
 *
 * @author Hamer
 */
public class UserDAO implements ICrudService<UsuarioModel> {
    UsuarioModel userModel = new UsuarioModel();
    MySqlConnection conexion = new MySqlConnection();
    
    @Override
    public List<UsuarioModel> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertInto(UsuarioModel user) {
        String sql = "INSERT INTO user(username, password, email, is_admin, nombres, apellidos, dni, direccion, url_image) VALUES (?,?,?,?,?,?,?,?,?);";
        PreparedStatement statement = null;
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setInt(4, user.getIsAdmin());
            statement.setString(5, user.getNombres());
            statement.setString(6, user.getApellidos());
            statement.setString(7, user.getDni());
            statement.setString(8, user.getDireccion());
            statement.setString(9, user.getUrlProfilePhoto());

            // Execute the statement
            statement.executeUpdate();
            System.out.println("Usuario insertedo existosamente!");
        } catch (SQLException e) {
            e.printStackTrace();
            
        } 
    }

    @Override
    public UsuarioModel selectById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?;";
        UsuarioModel user = new UsuarioModel();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
        
            if (resultSet.next()) { 
                
                user.setId(resultSet.getInt("id"));
                user.setNombres(resultSet.getString("nombres"));
                user.setApellidos(resultSet.getString("apellidos"));
                user.setDireccion(resultSet.getString("direccion"));
                user.setDni(resultSet.getString("dni"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setUsername(resultSet.getString("username"));
                user.setIsAdmin(resultSet.getInt("is_admin"));
                user.setUrlProfilePhoto(resultSet.getString("url_image"));
                
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
    
        return user;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(UsuarioModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<UsuarioModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<UsuarioModel> selectByUsername(String username) {
        
        String sql = "SELECT * FROM user WHERE username = ?;";
        List<UsuarioModel> users = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
        try {
            statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, username);
            resultSet = statement.executeQuery();
        
            while (resultSet.next()) { 
                UsuarioModel user = new UsuarioModel();
                user.setId(resultSet.getInt("id"));
                user.setNombres(resultSet.getString("nombres"));
                user.setApellidos(resultSet.getString("apellidos"));
                user.setDireccion(resultSet.getString("direccion"));
                user.setDni(resultSet.getString("dni"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setUsername(resultSet.getString("username"));
                user.setIsAdmin(resultSet.getInt("is_admin"));
                user.setUrlProfilePhoto(resultSet.getString("url_image"));
                users.add(user);
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
    
        return users;
    }    
}
