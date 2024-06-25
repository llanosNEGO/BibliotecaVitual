/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Calendar;

/**
 *
 * @author javm_
 */
public class Usuario {
    private int usuarioId;
    private String nombre;
    private String email;
    private String contraseña;
    private Calendar fechaRegistro;
    private int administradorId;

    public Usuario(String nombre, String email, String contraseña, Calendar fechaRegistro) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(int administradorId) {
        this.administradorId = administradorId;
    }

    @Override
    public String toString() {
        return "Usuario: " + "usuarioId=" + usuarioId + ", nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", fechaRegistro=" + fechaRegistro + ", administradorId=" + administradorId + ':';
    }
    
    
}
