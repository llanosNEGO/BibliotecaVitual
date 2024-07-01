/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.UserDAO;
import java.util.List;
import model.UsuarioModel;

/**
 *
 * @author Hamer
 */
public class UserService{

    private UserDAO userDAO;
    
    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    }
    
    public List<UsuarioModel> getAllUsers() {
        return userDAO.selectAll();
    }


    public void insertUser(UsuarioModel entity) {
        
    }

    public int checkUserandPassword(String username, String password){
        List<UsuarioModel> users = userDAO.selectByUsername(username);
        if(!users.isEmpty()){
            for(UsuarioModel user : users){
                if(user.getPassword().equals(password)) {
                    if(user.getIsAdmin() > 0){
                        return 2;
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
    
    public UsuarioModel getAllUserById(int id) {
        return userDAO.selectById(id);
    }

    
    public void delete(int id) {
        
    }

    
    public void update(int id, UsuarioModel entity) {
        
    }

    
    public List<UsuarioModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
