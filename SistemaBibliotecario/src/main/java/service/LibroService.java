/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import dao.BookDAO;
import java.util.List;
import model.LibroModel;

/**
 *
 * @author Hamer
 */
public class LibroService{
    
    private BookDAO bookDAO;
    private AutorService autorService;
    private EditorialService editorialService;

    public LibroService(BookDAO bookDAO) {
        
        this.bookDAO = bookDAO;
    }
    
    //public  LibroService(){};
    
    
   
    public void insertBook(LibroModel bookEntity) {
        
        bookDAO.insertInto(bookEntity);
        
    }

    
    public LibroModel selectBookById(int id) {
        
        return bookDAO.selectById(id);
        
        
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
