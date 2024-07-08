/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.PrestamoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PrestamoModel;

/**
 *
 * @author Hamer
 */
public class PrestamoService {
    
    private PrestamoDAO prestamoDAO;

    public PrestamoService(PrestamoDAO prestamoDAO) {
        this.prestamoDAO = prestamoDAO;
    }
    
    
    public void insertPrestamos(PrestamoModel prestamoEntity) {
        
        prestamoDAO.insertInto(prestamoEntity);
        
    }
    
    public List<PrestamoModel> getPrestamosByUserId(int id){
        return prestamoDAO.selectByIdOfUser(id);
    }
    
    public void removePrestamo(int id){
     prestamoDAO.delete(id);
    }
    
    public PrestamoModel getPrestamoById(int id){
     return prestamoDAO.selectById(id);
    }
    
    public DefaultTableModel getPrestamoByDNIOfUser(String dni){
        return prestamoDAO.selectByDNIOfUser(dni);
    }
    
    public void updateStateOfPrestamo(int id, int state){
        prestamoDAO.updateStateById(id, state);
    }
}
