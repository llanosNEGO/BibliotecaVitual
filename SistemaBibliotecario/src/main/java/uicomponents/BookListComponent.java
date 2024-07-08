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

public class BookListComponent extends JPanel {
    private JLabel imageLabel;
    private JLabel bookTitleLabel;
    private JLabel timeLabel;
    private JLabel stateLabel;

    public BookListComponent() {
        setLayout(new BorderLayout());
        
        
        // Placeholder image
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/booksImages/9786125125064.jpg")).getImage().getScaledInstance(70, 100, 0)); // Replace with actual image path
        imageLabel = new JLabel(imageIcon);
        add(imageLabel, BorderLayout.WEST);

        // Panel for text information
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        add(textPanel, BorderLayout.CENTER);

        bookTitleLabel = new JLabel("Book 1");
        bookTitleLabel.setFont(new Font("Cascadia Mono", Font.BOLD, 16));
        textPanel.add(bookTitleLabel);

        timeLabel = new JLabel("Time: In which class is paintComponent defined? why it returns JLabel in void method?");
        timeLabel.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
        textPanel.add(timeLabel);

        stateLabel = new JLabel("Estado: por recoger");
        stateLabel.setFont(new Font("Cascadia Mono", Font.PLAIN, 14));
        textPanel.add(stateLabel);

        // Three dots button
        JButton dotsButton = new JButton("Cancelar");
        add(dotsButton, BorderLayout.EAST);
        setPreferredSize(new Dimension(70, 100));
    }

    public void setImageLabel(String url) {
        Icon icon = new ImageIcon(
               new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(70, 100, 0)
        );
        imageLabel.setIcon(icon);
    }

    public void setBookTitleLabel(String titleLabel) {
        this.bookTitleLabel.setText(titleLabel);
    }

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    public void setStateLabel(String stateLabel) {
        this.stateLabel.setText(stateLabel);
    }

    
}
