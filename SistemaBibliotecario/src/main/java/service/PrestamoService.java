/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.PrestamoDAO;
import java.util.List;
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
    
}
