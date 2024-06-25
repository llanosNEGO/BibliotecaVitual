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
public class Prestamos {
    private int prestamoId;
    private int usuarioId;
    private int libroId;
    private Calendar fechaPrestamo;
    private Calendar fechaDevolucion;
    private int administradorId;

    public Prestamos(Calendar fechaPrestamo, Calendar fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public Calendar getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Calendar fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(int administradorId) {
        this.administradorId = administradorId;
    }

    @Override
    public String toString() {
        return "Prestamos: " + "prestamoId=" + prestamoId + ", usuarioId=" + usuarioId + ", libroId=" + libroId + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", administradorId=" + administradorId + '"';
    }
    
}
