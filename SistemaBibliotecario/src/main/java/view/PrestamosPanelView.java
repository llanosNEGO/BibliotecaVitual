/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AutorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import dao.PrestamoDAO;
import dao.UserDAO;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
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
        this(null);
    }

    public PrestamosPanelView(UsuarioModel user) {
        this.user = user;
        this.prestamoService = createPrestamoService();
        initComponents();
        displayPrestamos1();
    }

    private PrestamoService createPrestamoService() {
        AutorDAO autorDAO = new AutorDAO();
        EditorialDAO editorialDAO = new EditorialDAO();
        BookDAO bookDAO = new BookDAO(autorDAO, editorialDAO);
        UserDAO userDAO = new UserDAO();
        PrestamoDAO prestamoDAO = new PrestamoDAO(bookDAO, userDAO);
        return new PrestamoService(prestamoDAO);
    }

    private void displayPrestamos(){
        prestamos = prestamoService.getPrestamosByUserId(user.getId());
        
        prestamosListPanel = new JPanel();
        GridLayout layout = new GridLayout(5, 1, 20, 20); 
        
        prestamosListPanel.setLayout(new BoxLayout(prestamosListPanel, BoxLayout.Y_AXIS));
        //prestamosListPanel.setSize(842, 535);
        prestamosListPanel.setLocation(0,0);
        prestamosListPanel.setBackground(new Color(255,255,255));
        
        
        for(PrestamoModel prestamo : prestamos){
            BookListComponent bookComponent = new BookListComponent();
            bookComponent.setBookTitleLabel(prestamo.getLibro().getTitulo());
            bookComponent.setImageLabel(prestamo.getLibro().getUrlImage());
            bookComponent.setSize(100, 100);
            prestamosListPanel.add(bookComponent);
            //prestamosListPanel.add(Box.createRigidArea(new Dimension(0,90)));
        }
        
        jScrollPane = new JScrollPane(prestamosListPanel);
        jScrollPane.setSize(842,535);
        jScrollPane.setLocation(0,0);
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(jScrollPane, BorderLayout.CENTER);
        repaint();
        revalidate();
    }
    
    private void displayPrestamos1() {
    prestamos = prestamoService.getPrestamosByUserId(user.getId());
        prestamosListPanel = new JPanel();
        prestamosListPanel.setLayout(new GridBagLayout());
        prestamosListPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // spacing between components
         gbc.anchor = GridBagConstraints.NORTHWEST;
        for (PrestamoModel prestamo : prestamos) {
            BookListComponent bookComponent = new BookListComponent();
            bookComponent.setBookTitleLabel(prestamo.getLibro().getTitulo());
            bookComponent.setImageLabel(prestamo.getLibro().getUrlImage());
            bookComponent.setPreferredSize(new Dimension(800, 100)); // Preferred size for each component

            prestamosListPanel.add(bookComponent, gbc);
            gbc.gridy++; // Move to the next row
        }

        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.add(prestamosListPanel, BorderLayout.NORTH);

        jScrollPane = new JScrollPane(wrapperPanel);
        jScrollPane.setPreferredSize(new Dimension(842, 535));
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());

        setLayout(new BorderLayout());
        add(jScrollPane, BorderLayout.NORTH);

        revalidate();
        repaint();
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
