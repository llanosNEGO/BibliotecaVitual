/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;



/**
 *
 * @author javm_
 */
public class PrestamoModel {
    private int id;
    private int cantidad;
    private UsuarioModel usuario;
    private LibroModel libro;
    private int estado; // 0: en proceso; 1: procesado y entregado
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public PrestamoModel(int cantidad, UsuarioModel usuario, LibroModel libro, Date fechaPrestamo, Date fechaDevolucion) {
        this(cantidad,  usuario,  libro, 0, fechaPrestamo, fechaDevolucion);
    }

    public PrestamoModel(int cantidad, UsuarioModel usuario, LibroModel libro, int estado, Date fechaPrestamo, Date fechaDevolucion) {
        
        this.cantidad = cantidad;
        this.usuario = usuario;
        this.libro = libro;
        this.estado = estado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    
    public PrestamoModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public LibroModel getLibro() {
        return libro;
    }

    public void setLibro(LibroModel libro) {
        this.libro = libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    

    

    
    
}
