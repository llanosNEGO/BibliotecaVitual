package model;

import java.util.Calendar;

public class ComentarioModel {
    private int id;
    private UsuarioModel usuario;
    private LibroModel libro;
    private String contenido;
   

    public ComentarioModel() {
    }

    public ComentarioModel(UsuarioModel usuario, LibroModel libro, String contenido) {
        this.usuario = usuario;
        this.libro = libro;
        this.contenido = contenido;
    }

    public ComentarioModel(int id, UsuarioModel usuario, LibroModel libro, String contenido) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "ComentarioModel{" + "id=" + id + ", usuario=" + usuario + ", libro=" + libro + ", contenido=" + contenido + '}';
    }

    
    
    
}
