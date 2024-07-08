/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import dao.AutorDAO;
import dao.BookDAO;
import dao.EditorialDAO;
import dao.PrestamoDAO;
import dao.UserDAO;
import java.util.List;
import model.LibroModel;
import model.PrestamoModel;

/**
 *
 * @author Hamer
 */
public class LibroService{
    
    private BookDAO bookDAO;
    private PrestamoDAO prestamosDAO;

    public LibroService(BookDAO bookDAO) {
        
        this.bookDAO = bookDAO;
    }
    
    //public  LibroService(){};
    
    
   
    public void addBook(LibroModel bookEntity) {
        
        bookDAO.insertInto(bookEntity);
        
    }

    
    public LibroModel getBookById(int id) {
        
        return bookDAO.selectById(id);
        
        
    }

    public int calcCantoOfBooks(int id){
       prestamosDAO = new PrestamoDAO(new BookDAO(new AutorDAO(), new EditorialDAO()), new UserDAO());
       LibroModel book = bookDAO.selectById(id);
       List<PrestamoModel> prestamos = prestamosDAO.selectByIdOfBook(id);
       int numtAvailableBooks = book.getTotalEjemplares();
       int numBooksBorrowed = prestamos.stream().mapToInt(PrestamoModel::getCantidad).sum();
       numtAvailableBooks = numtAvailableBooks - numBooksBorrowed;
        
        
       bookDAO.updateNumOfBooks(numtAvailableBooks, id);
        
       return 0;
    }
   
    public void delete(int id) {
        
    }

    
    public void update(int id, LibroModel entity) {
        
    }

    
    public List<LibroModel> search(String keyword) {
        return bookDAO.search(keyword);
    }

   
    
    
    public List<LibroModel> getAllBooks() {
        
        return bookDAO.selectAll();
        
    }

}
