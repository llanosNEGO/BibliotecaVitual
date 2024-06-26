package model;

import java.util.Calendar;

public class LibroModel {
    private int id;
    private String titulo;
    private String sinopsis;
    private String urlImage;
    private String isbn;
    private Calendar anioPublicacion;
    private int idAutor;
    private int idEditorial;

    public LibroModel(String titulo, String Sinopsis, String urlImage, String isbn, Calendar añoPublicacion, int idAutor, int idEditorial) {
        this.titulo = titulo;
        this.sinopsis = Sinopsis;
        this.urlImage = urlImage;
        this.isbn = isbn;
        this.anioPublicacion = añoPublicacion;
        this.idAutor = idAutor;
        this.idEditorial = idEditorial;
    }

    public LibroModel() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.sinopsis = Sinopsis;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Calendar getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Calendar añoPublicacion) {
        this.anioPublicacion = añoPublicacion;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        
    @Override
    public String toString() {
        return "LibroModel{" + "titulo=" + titulo + ", Sinopsis=" + sinopsis + ", urlImage=" + urlImage + ", isbn=" + isbn + ", a\u00f1oPublicacion=" + anioPublicacion + ", idAutor=" + idAutor + ", idEditorial=" + idEditorial + '}';
    }
    

    

    
   
    
    
}