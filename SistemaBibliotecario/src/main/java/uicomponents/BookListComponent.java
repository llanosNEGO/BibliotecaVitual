/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uicomponents;

/**
 *
 * @author Hamer
 */
import dao.AutorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import dao.PrestamoDAO;
import dao.UserDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.PrestamoModel;
import service.LibroService;
import service.PrestamoService;
import view.PrestamosPanelView;

public class BookListComponent extends JPanel {
    private JLabel imageLabel;
    private JLabel bookTitleLabel;
    private JLabel amountLabel;
    private JLabel timeLabel;
    private JLabel stateLabel;
    //private int idPrestamo;
    private PrestamoService prestamoService;
    private LibroService bookService;

    public BookListComponent(PrestamoModel prestamo, PrestamosPanelView prestamoPanel) {
        setupServices();
        setLayout(new BorderLayout());
        // Placeholder image
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/booksImages/9786125125064.jpg")).getImage().getScaledInstance(70, 100, 0)); // Replace with actual image path
        imageLabel = new JLabel(imageIcon);
        add(imageLabel, BorderLayout.WEST);

        // Panel for text information
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBackground(Color.WHITE);
        add(textPanel, BorderLayout.CENTER);

        bookTitleLabel = new JLabel("  Book 1");
        bookTitleLabel.setFont(new Font("Cascadia Mono", Font.BOLD, 14));
        textPanel.add(bookTitleLabel);

        timeLabel = new JLabel("   Tiempo: In which class is paintComponent defined? why it returns JLabel in void method?");
        timeLabel.setFont(new Font("Cascadia Mono", Font.PLAIN, 11));
        textPanel.add(timeLabel);
        
        amountLabel = new JLabel("   Cantidad: In which class is paintComponent defined? why it returns JLabel in void method?");
        amountLabel.setFont(new Font("Cascadia Mono", Font.PLAIN, 11));
        textPanel.add(amountLabel);

        stateLabel = new JLabel("   Estado: por recoger");
        stateLabel.setFont(new Font("Cascadia Mono", Font.PLAIN, 11));
        textPanel.add(stateLabel);

        // Three dots button
        JButton dotsButton = new JButton("Cancelar");
        setPreferredSize(new Dimension(70, 100));
        if(prestamo.getEstado() == 0){
        
        add(dotsButton, BorderLayout.EAST);
        
        }
        
         dotsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    // Perform the cancellation action
                    bookService.calcCantoOfAvailableBooksAfterDevolve(prestamoService.getPrestamoById(prestamo.getId()));
                    prestamoService.removePrestamo(prestamo.getId());
                    prestamoPanel.displayPrestamos1();
                    System.out.println("Cancellation confirmed.");
                }
            }
        });
    }

    public void setupServices(){
        BookDAO bookDAO = new BookDAO(new AutorDAO(), new EditorialDAO() );
        UserDAO userDAO = new UserDAO();
        PrestamoDAO prestamoDAO = new PrestamoDAO(bookDAO, userDAO);
        prestamoService = new PrestamoService(prestamoDAO);
        bookService = new LibroService(bookDAO);
    }
    public void setImageLabel(String url) {
        Icon icon = new ImageIcon(
               new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(70, 100, 0)
        );
        imageLabel.setIcon(icon);
    }

    public void setBookTitleLabel(String titleLabel) {
        this.bookTitleLabel.setText("  "+titleLabel);
    }

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }
    
    public void setTimeLabel(String timeFrom, String timeTo){
        this.timeLabel.setText("   Tiempo: "+timeFrom+" a "+timeTo);
    }
    public void setAmountLabel(String amount){
        this.amountLabel.setText("   Cantidad: "+amount);
    }
    public void setStateLabel(String stateLabel) {
        this.stateLabel.setText("   Estado: "+stateLabel);
    }

   

    
}
