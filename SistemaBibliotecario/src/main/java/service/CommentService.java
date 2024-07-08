/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.CommentDAO;
import java.util.List;
import model.ComentarioModel;

/**
 *
 * @author Hamer
 */
public class CommentService {
    private CommentDAO commentDAO;

    public CommentService(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }
    
    public List<ComentarioModel> getCommentByIdOfBook(int id){
      return commentDAO.selectByIdOfBook(id);
    }
    
    public void addComment(ComentarioModel entity){
      commentDAO.insertInto(entity);
    }
}
