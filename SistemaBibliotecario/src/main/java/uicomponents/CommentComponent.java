/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uicomponents;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Hamer
 */
public class CommentComponent extends JPanel {
    
    private JPanel commentPanel;
    private JLabel userLabel;
    private JLabel commentLabel;
    private JSeparator separator;
    private String user;
    private JEditorPane commentTextPane;
    public CommentComponent(String user, String content){
        setLayout(new BorderLayout());
        
        commentPanel = new JPanel();
        commentPanel.setLayout(new BoxLayout(commentPanel, BoxLayout.Y_AXIS));
        add(commentPanel, BorderLayout.WEST);
        
        JTextArea textArea =new JTextArea(content+" - @"+user, 0, 46);
        textArea.setFont(new Font("Serif", Font.PLAIN, 12));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        commentPanel.add(textArea);

        /*String commentText = "Could you provide an image of what you want using paint or something and put it somewhere to show us what you want? Is the circle label supposed to show a string in a circular way, or should it show a circular Icon? - <b>Pedro</b>";
        commentTextPane = new JEditorPane("text/html", commentText);
        commentTextPane.setFont(new Font("Serif", Font.PLAIN, 11));
        commentTextPane.setOpaque(false);
        commentTextPane.setEditable(false);

        // Add scroll pane for text area to handle large text
        JScrollPane scrollPane = new JScrollPane(commentTextPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        add(scrollPane, BorderLayout.CENTER);*/
  
        separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setMinimumSize(new Dimension(Integer.MAX_VALUE, separator.getPreferredSize().height));
        separator.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        commentPanel.add(separator);
        this.setMaximumSize(new Dimension(200, 50));

    }
}
