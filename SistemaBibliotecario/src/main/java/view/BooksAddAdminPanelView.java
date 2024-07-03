/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AutorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import model.*;
import service.*;

/**
 *
 * @author Hamer
 */
public class BooksAddAdminPanelView extends javax.swing.JPanel {

    private LibroService bookService;
    private EditorialService editorialService;
    private AutorService authorService;
    private BookDAO bookDAO;
    private DefaultListModel<String> listAuthorModel = new DefaultListModel<>();
    private DefaultListModel<String> listEditorialModel = new DefaultListModel<>();
    private List<AutorModel> authors;
    private List<EditorialModel> editorials;
    private String isbn;
    private Path imageBooksourcePath;
    private Path imagetargetDirectory;
    private String imageBookfileExtentions;
    private Path projectDir;
    
    public BooksAddAdminPanelView() {
        initComponents();
        // initializing services
        editorialService = new EditorialService(new EditorialDAO());
        authorService = new AutorService(new AutorDAO());
        bookDAO = new BookDAO(authorService, editorialService);
        bookService = new LibroService(bookDAO);

        //
        this.setSize(1076, 535);
        projectDir = Paths.get(System.getProperty("user.dir"));
        setImageLabel(imageBookLabel,"/icons/add128.png", 100, 100, true );
        populateJlists();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsisTextPane = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        imageBookLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        donadorTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        authorList = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        editorialList = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel1.setText("Titulo:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        titleTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });
        add(titleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 250, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setText("ISBN:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        isbnTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        add(isbnTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 250, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel3.setText("Sinopsis:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        sinopsisTextPane.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(sinopsisTextPane);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 310, 200));

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel4.setText("Año publicación:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        yearTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        add(yearTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, -1));

        imageBookLabel.setBackground(new java.awt.Color(204, 204, 204));
        imageBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageBookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        imageBookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imageBookLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageBookLabel.setOpaque(true);
        imageBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageBookLabelMouseClicked(evt);
            }
        });
        add(imageBookLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 240, 350));

        jRadioButton1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jRadioButton1.setText("Donación");
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 20));

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setText("By:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 30, 20));

        donadorTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        add(donadorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 290, -1));

        jButton1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        add(amountSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 40, -1));

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel7.setText("Autor:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 50, -1));

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setText("Editorial:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        authorList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        authorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        authorList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(authorList);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 200, -1));

        editorialList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editorialList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        editorialList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(editorialList);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 200, 150));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        isbn = isbnTextField.getText().trim();
        imagetargetDirectory = Paths.get(projectDir + "/src/main/resources/booksImages/"+ isbn +"."+ imageBookfileExtentions);
        Year year = Year.parse(yearTextField.getText().trim());
        String titleBook = titleTextField.getText().trim().toUpperCase();    
        String sinopsis = sinopsisTextPane.getText().trim();
        String urlImageBook = "/booksImages/"+isbn+"."+imageBookfileExtentions;
        String donador = donadorTextField.getText().trim();
        int amount = (Integer)amountSpinner.getValue();
        AutorModel author = authors.stream().filter(a -> a.getNombre().equals(authorList.getSelectedValue())).findFirst().orElse(null);
        EditorialModel editorial1 = editorials.stream().filter(editorial -> editorial.getNombre().equals(editorialList.getSelectedValue())).findFirst().orElse(null);
        
        LibroModel book = new LibroModel(titleBook,sinopsis, urlImageBook, isbn, year, author ,editorial1 );
        bookService.insertBook(book);
        try {
            Files.copy(imageBooksourcePath, imagetargetDirectory, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(BooksAddAdminPanelView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imageBookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageBookLabelMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();            
            imageBooksourcePath = Paths.get(selectedFile.getAbsolutePath()); 
            imageBookfileExtentions = imageBooksourcePath.toString().substring(imageBooksourcePath.toString().lastIndexOf(".") + 1);            
            try {
                setImageLabel(imageBookLabel, selectedFile.getAbsolutePath(), imageBookLabel.getWidth(), imageBookLabel.getHeight(), false);               
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }
    }//GEN-LAST:event_imageBookLabelMouseClicked

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void populateJlists(){
        authors = authorService.getAllAuthors();
        editorials = editorialService.getAllEditorials();
        
        for(AutorModel author : authors){
            listAuthorModel.addElement(author.getNombre());
        }
        for(EditorialModel editorial : editorials){
            listEditorialModel.addElement(editorial.getNombre());
        }
        
        authorList.setModel(listAuthorModel);
        editorialList.setModel(listEditorialModel);
    }
    private void setImageLabel(JLabel jLabel, String url, int width, int height, boolean fromProject){
        Icon icon = null;
        if(fromProject){
            icon = new ImageIcon(
               new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(width, height, 0)
                );
        }else{
            icon = new ImageIcon(
               new ImageIcon(url).getImage().getScaledInstance(width, height, 0)
            );
        }
        jLabel.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JList<String> authorList;
    private javax.swing.JTextField donadorTextField;
    private javax.swing.JList<String> editorialList;
    private javax.swing.JLabel imageBookLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane sinopsisTextPane;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
