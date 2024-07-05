/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.AutorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import java.awt.BorderLayout;
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
        displayBooks = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel1.setText("Titulo:");

        titleTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setText("ISBN:");

        isbnTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel3.setText("Sinopsis:");

        sinopsisTextPane.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(sinopsisTextPane);

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel4.setText("Año publicación:");

        yearTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

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

        jRadioButton1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jRadioButton1.setText("Donación");

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel6.setText("By:");

        donadorTextField.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel7.setText("Autor:");

        jLabel8.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        jLabel8.setText("Editorial:");

        authorList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        authorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        authorList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(authorList);

        editorialList.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editorialList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        editorialList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(editorialList);

        displayBooks.setText("Ver Libros");
        displayBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        displayBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayBooksMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(imageBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(donadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addGap(17, 17, 17)
                        .addComponent(displayBooks)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(displayBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
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

    private void displayBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayBooksMouseClicked
        BooksPanelView b1 = new BooksPanelView(true);
        b1.setSize(842,535);
        b1.setLocation(0, 0);
        this.removeAll();
        this.add(b1, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_displayBooksMouseClicked

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
    private javax.swing.JLabel displayBooks;
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
