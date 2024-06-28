/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import model.LibroModel;
import service.LibroService;
import uicomponents.BookPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *
 * @author Hamer
 */
public class BooksPanelView extends javax.swing.JPanel {
    
    LibroService bookService = new LibroService();
    List<LibroModel> libros;
    JPanel t1;
    JScrollPane js;
    
    public BooksPanelView() {
        initComponents(); 
        /*BookPanel bookView = new BookPanel("asa", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9786123198640.jpg")));
        BookPanel bookView1 = new BookPanel("asa", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9786123198640.jpg")));
        BookPanel bookView2 = new BookPanel("asa", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9781400334780.jpg")));
        BookPanel bookView3 = new BookPanel("hamer", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9781400334780.jpg")));
        BookPanel bookView4 = new BookPanel("12323", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9786123198640.jpg")));
        BookPanel bookView5 = new BookPanel("asa", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9781400334780.jpg")));
        BookPanel bookView6= new BookPanel("asa", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9781400334780.jpg")));
        BookPanel bookView7 = new BookPanel("asa", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9786123198640.jpg")));
        BookPanel bookView8 = new BookPanel("hamer", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9786123198640.jpg")));
        BookPanel bookView9 = new BookPanel("12323", "dfd", new javax.swing.ImageIcon(getClass().getResource("/booksImages/9786123198640.jpg")));
        //layout.addLayoutComponent(TOOL_TIP_TEXT_KEY, bookView);*/
        paintElements();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(204, 208, 207));
        setMinimumSize(new java.awt.Dimension(842, 535));
        setPreferredSize(new java.awt.Dimension(861, 535));

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

    private void paintElements(){
        libros = bookService.selectAll();
        t1 = new JPanel();
        GridLayout layout = new GridLayout(0, 3, 20, 20);         
        t1.setLayout(layout);
        t1.setSize(842, 535);
        t1.setLocation(0,0);
        for (LibroModel element : libros) {
            BookPanel bookView = new BookPanel();
            
            bookView.setBookName(element.getTitulo());
            bookView.setAuthor(element.getAutor().getNombre());
            bookView.setBookImage(element.getUrlImage());
            t1.add(bookView); 
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
        js = new JScrollPane(t1);
        js.setSize(842,535);
        js.setLocation(0,0);
        js.setBorder(BorderFactory.createEmptyBorder());
        add(js, BorderLayout.CENTER);
        repaint();
        revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
