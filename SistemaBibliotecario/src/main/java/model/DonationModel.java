/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Calendar;

/**
 *
 * @author javm_
 */
public class DonationModel {
    private int id;
    private String entityOrPerson;
    private LibroModel book;

    public DonationModel(String entityOrPerson, LibroModel book) {
        this.entityOrPerson = entityOrPerson;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntityadOrPerson() {
        return entityOrPerson;
    }

    public void setEntityadOrPerson(String entityadOrPerson) {
        this.entityOrPerson = entityOrPerson;
    }

    public LibroModel getBook() {
        return book;
    }

    public void setBook(LibroModel book) {
        this.book = book;
    }

    
    
    
}
