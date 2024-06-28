/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uicomponents;

/**
 *
 * @author Hamer
 */
import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.BookInfoPanelView;
import view.UserView;

public class BookPanel extends JPanel {
    private JLabel imageLabel;
    private JLabel authorLabel;
    private JLabel bookNameLabel;

    public BookPanel() {
        this("Author", "Book Name", null);
    }

    public BookPanel(String author, String bookName, Icon bookImage) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 300));
        imageLabel = new JLabel();
        if (bookImage != null) {
            imageLabel.setIcon(bookImage);
        }
        
        add(imageLabel, BorderLayout.CENTER);
        authorLabel = new JLabel(author);
        bookNameLabel = new JLabel(bookName);
        
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 1));
        textPanel.add(authorLabel);
        textPanel.add(bookNameLabel);
        add(textPanel, BorderLayout.SOUTH);
        
        // Center texts 
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);
        authorLabel.setHorizontalAlignment(JLabel.CENTER);
        bookNameLabel.setHorizontalAlignment(JLabel.CENTER);
        //cursor
        imageLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //fonts
        bookNameLabel.setFont(Fonts.CASCADIACODE.getFont());
        authorLabel.setFont(Fonts.CASCADIACODE.getFont());
        //UserView v = new UserView();
        
    }

    public void setAuthor(String author) {
        authorLabel.setText(author);
    }

    public void setBookName(String bookName) {
        bookNameLabel.setText(bookName);
    }

    public void setBookImage(String url) {
        Icon icon = new ImageIcon(
               new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(200, 300, 0)
        );
        imageLabel.setIcon(icon);
    }
}

