/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author Hamer
 */
import javax.swing.*;
import java.awt.*;


public class BookViewPanel extends JPanel {
    private JPanel imagePanel;
    private JLabel authorLabel;
    private JLabel bookNameLabel;

    public BookViewPanel() {
        // Call the constructor with default values
        this("Author", "Book Name", null);
    }

    public BookViewPanel(String author, String bookName, Icon bookImage) {
        // Set layout for the panel
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 300));
        
        // Initialize the image panel and add the image label
        imagePanel = new JPanel();
        JLabel imageLabel = new JLabel(bookImage);
        imagePanel.add(imageLabel);
        add(imagePanel, BorderLayout.CENTER);
        
        // Initialize the labels
        authorLabel = new JLabel("Author: " + author);
        bookNameLabel = new JLabel("Book: " + bookName);
        
        // Set up a panel for the text labels
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 1));
        textPanel.add(authorLabel);
        textPanel.add(bookNameLabel);
        imagePanel.setBackground(Color.GRAY);
        add(textPanel, BorderLayout.SOUTH);
    }

    // Setters for author and book name
    public void setAuthor(String author) {
        authorLabel.setText("Author: " + author);
    }

    public void setBookName(String bookName) {
        bookNameLabel.setText("Book: " + bookName);
    }

    public void setBookImage(Icon bookImage) {
        ((JLabel) imagePanel.getComponent(0)).setIcon(bookImage);
    }
}
