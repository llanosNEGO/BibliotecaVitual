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
public class UsuarioModel extends PersonaModel{
    private int id;
    private String username;
    private String password;
    private int isAdmin;

    public UsuarioModel() {
    }

    public UsuarioModel(String username, String password, int isAdmin, String nombres, String apellidos, String dni, String direccion, String email) {
        super(nombres, apellidos, dni, direccion, email);
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "UsuarioModel{" + "username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + '}';
    }   
    
}
