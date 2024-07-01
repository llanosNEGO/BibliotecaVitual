/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import dao.AutorDAO;
import java.util.List;
import model.AutorModel;


/**
 *
 * @author Hamer
 */
public class AutorService {
    private AutorDAO authorDAO;
    public AutorService(AutorDAO authorDAO){
        this.authorDAO = authorDAO;
    }
    
    public List<AutorModel> getAllAuthors() {
        return authorDAO.selectAll();
       
    }

    
    public void insertInto(AutorModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public AutorModel selectById(int id) {
        
        return authorDAO.selectById(id);
    }

    
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public void update(int id, AutorModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public List<AutorModel> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
