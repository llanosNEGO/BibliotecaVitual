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
    private Calendar fechaRegistro;
    private int administradorId;

    public UsuarioModel() {
    }

    public UsuarioModel(Calendar fechaRegistro, int administradorId, int codigo, String nombre, String email, String contraseña) {
        super(codigo, nombre, email, contraseña);
        this.fechaRegistro = fechaRegistro;
        this.administradorId = administradorId;
    }

    public UsuarioModel(Calendar fechaRegistro, int administradorId, String nombre, String email, String contraseña) {
        super(nombre, email, contraseña);
        this.fechaRegistro = fechaRegistro;
        this.administradorId = administradorId;
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
        return "Usuario{" + "fechaRegistro=" + fechaRegistro + ", administradorId=" + administradorId + '}';
    }

    
    
}
