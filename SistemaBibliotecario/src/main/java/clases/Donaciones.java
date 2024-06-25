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
public class Donaciones {
    private int donacionId;
    private int usuarioId;
    private int libroId;
    private Calendar fechaDonacion;
    private int administradoId;

    public Donaciones(Calendar fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public int getDonacionId() {
        return donacionId;
    }

    public void setDonacionId(int donacionId) {
        this.donacionId = donacionId;
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

    public Calendar getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Calendar fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public int getAdministradoId() {
        return administradoId;
    }

    public void setAdministradoId(int administradoId) {
        this.administradoId = administradoId;
    }

    @Override
    public String toString() {
        return "Donaciones: " + "donacionId=" + donacionId + ", usuarioId=" + usuarioId + ", libroId=" + libroId + ", fechaDonacion=" + fechaDonacion + ", administradoId=" + administradoId + "";
    }
    
    
}
