/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import model.LibroModel;

/**
 *
 * @author Hamer
 */
public class BookInfoAdminPanelView extends javax.swing.JPanel {

    private LibroModel book;
    public BookInfoAdminPanelView() {
        initComponents();
    }

    public BookInfoAdminPanelView(LibroModel book) {
        initComponents();
        this.book = book;
        displayInfo();
    }

    public void displayInfo(){
        Icon icon = new ImageIcon(
               new ImageIcon(getClass().getResource(book.getUrlImage())).getImage().getScaledInstance(200, 300, 0)
        );
        bookImage.setIcon(icon);
        tituloLabel.setText(book.getTitulo());
        isbnLabel.setText(book.getIsbn());
        autorLabel.setText(book.getAutor().getNombre());
        sinopsisPane.setText(book.getSinopsis());
        editorialLabel.setText(book.getEditorial().getNombre());
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        autorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        editorialLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bookImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sinopsisPane = new javax.swing.JTextPane();
        tituloLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(842, 535));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel1.setText("ISBN:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, -1));

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel3.setText("Autor:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel4.setText("Editorial:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        isbnLabel.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        isbnLabel.setText("jLabel5");
        jPanel3.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, -1));

        autorLabel.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        autorLabel.setText("jLabel5");
        jPanel3.add(autorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 140, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 20));

        editorialLabel.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editorialLabel.setText("jLabel5");
        jPanel3.add(editorialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, -1));

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N
        jLabel2.setText("SINOPSIS");

        jScrollPane2.setBorder(null);

        sinopsisPane.setBackground(new java.awt.Color(255, 255, 255));
        sinopsisPane.setBorder(null);
        sinopsisPane.setFont(new java.awt.Font("Playwrite NG Modern", 0, 12)); // NOI18N
        sinopsisPane.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sinopsisPane.setEnabled(false);
        jScrollPane2.setViewportView(sinopsisPane);

        tituloLabel.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        tituloLabel.setText("Titulo");

        jButton1.setText("Editar");

        jButton2.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookImage, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(11, 11, 11))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorLabel;
    private javax.swing.JLabel bookImage;
    private javax.swing.JLabel editorialLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane sinopsisPane;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
