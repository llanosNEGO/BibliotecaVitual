/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.PrestamoDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.PrestamoModel;
import model.UsuarioModel;
import service.PrestamoService;
import uicomponents.BookListComponent;
/**
 *
 * @author Hamer
 */
public class PrestamosPanelView extends javax.swing.JPanel {

    private JPanel prestamosListPanel;
    private JScrollPane jScrollPane;
    private UsuarioModel user;
    private List<PrestamoModel> prestamos;
    private PrestamoService prestamoService;
    public PrestamosPanelView() {
        initComponents();
        this.prestamoService = new PrestamoService(new PrestamoDAO());
        displayPrestamos();
    }
    
    public PrestamosPanelView(UsuarioModel user) {
        initComponents();
        this.prestamoService = new PrestamoService(new PrestamoDAO());
        this.user = user;
        displayPrestamos();
    }

    private void displayPrestamos(){
        prestamos = prestamoService.getPrestamosByUserId(user.getId());
        System.out.println(prestamos.isEmpty());
        prestamosListPanel = new JPanel();
        GridLayout layout = new GridLayout(0, 1, 20, 20); 
        
        prestamosListPanel.setLayout(layout);
        prestamosListPanel.setSize(842, 535);
        prestamosListPanel.setLocation(0,0);
        prestamosListPanel.setBackground(new Color(255,255,255));
        System.out.println("holaperras");
        System.out.println(user.getId());
        for(PrestamoModel prestamo : prestamos){
            BookListComponent bookComponent = new BookListComponent();
            bookComponent.setBookTitleLabel(prestamo.getLibro().getTitulo());
            bookComponent.setImageLabel(prestamo.getLibro().getUrlImage());
            bookComponent.setSize(100, 100);
            prestamosListPanel.add(bookComponent);
            System.out.println("sdsd");
            System.out.println(prestamo.getLibro().getTitulo());
        }
        
        System.out.println("holaperras2");
        jScrollPane = new JScrollPane(prestamosListPanel);
        jScrollPane.setSize(842,535);
        jScrollPane.setLocation(0,0);
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(jScrollPane, BorderLayout.CENTER);
        repaint();
        revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
