package clases;

import java.util.Calendar;

public class Libro {
    private int idLibro;
    private String titulo;
    private int idAutor;
    private int idEditorial;
    private Calendar añoPublicacion;
    private String isbn;
    private int idAdministrador;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, int idAutor, int idEditorial, Calendar añoPublicacion, String isbn, int idAdministrador) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.idAutor = idAutor;
        this.idEditorial = idEditorial;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.idAdministrador = idAdministrador;
    }

    public Libro(String titulo, int idAutor, int idEditorial, Calendar añoPublicacion, String isbn, int idAdministrador) {
        this.titulo = titulo;
        this.idAutor = idAutor;
        this.idEditorial = idEditorial;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.idAdministrador = idAdministrador;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public Calendar getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(Calendar añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titulo=" + titulo + ", idAutor=" + idAutor + ", idEditorial=" + idEditorial + ", a\u00f1oPublicacion=" + añoPublicacion + ", isbn=" + isbn + ", idAdministrador=" + idAdministrador + '}';
    }
    
    
}
