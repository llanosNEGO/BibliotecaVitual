/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;
import dao.BookDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import model.LibroModel;
import service.LibroService;
import uicomponents.BookPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import service.*;
/**
 *
 * @author Hamer
 */
public class BooksPanelView extends javax.swing.JPanel {
    
    private LibroService bookService;
    private List<LibroModel> libros;
    private JPanel bookGalleryPanel;
    private JScrollPane jScrollPane;
    
    public BooksPanelView() {
       initComponents();
       this.bookService = new LibroService(new BookDAO());
       setSize(842, 535);
        displayBooks();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(204, 208, 207));
        setMinimumSize(new java.awt.Dimension(842, 535));
        setPreferredSize(new java.awt.Dimension(842, 535));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void displayBooks(){
        libros = bookService.getAllBooks();
        bookGalleryPanel = new JPanel();
        GridLayout layout = new GridLayout(0, 3, 20, 20);         
        bookGalleryPanel.setLayout(layout);
        bookGalleryPanel.setSize(842, 535);
        bookGalleryPanel.setLocation(0,0);
        bookGalleryPanel.setBackground(new Color(255,255,255));
        for (LibroModel element : libros) {
            BookPanel bookView = new BookPanel();
            
            bookView.setBookName(element.getTitulo());
            bookView.setAuthor(element.getAutor().getNombre());
            bookView.setBookImage(element.getUrlImage());
            bookGalleryPanel.add(bookView); 
            System.out.println(element.getTitulo());
            
            // clickEvent to change to BookInfoPanelView
            bookView.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            BookInfoPanelView bookInfo = new BookInfoPanelView(element);
            bookInfo.setSize(842,535);
            bookInfo.setLocation(0, 0);
            
            removeAll();
            add(bookInfo, BorderLayout.CENTER);
            repaint();
            revalidate();
                System.out.println("Hola");
            }
        });
        }
        jScrollPane = new JScrollPane(bookGalleryPanel);
        jScrollPane.setSize(842,535);
        jScrollPane.setLocation(0,0);
        jScrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(jScrollPane, BorderLayout.CENTER);
        repaint();
        revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
