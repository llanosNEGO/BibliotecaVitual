package model;


import java.time.Year;


public class LibroModel {
    private int id;
    private String titulo;
    private String sinopsis;
    private String urlImage;
    private String isbn;
    private Year anioPublicacion;
    private AutorModel autor;
    private EditorialModel editorial;

    public LibroModel(String titulo, String Sinopsis, String urlImage, String isbn, Year añoPublicacion, AutorModel autor, EditorialModel editorial) {
        this.titulo = titulo;
        this.sinopsis = Sinopsis;
        this.urlImage = urlImage;
        this.isbn = isbn;
        this.anioPublicacion = añoPublicacion;
        this.autor = autor;
        this.editorial = editorial;
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

    public Year getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Year añoPublicacion) {
        this.anioPublicacion = añoPublicacion;
    }

    public AutorModel getAutor() {
        return autor;
    }

    public void setAutor(AutorModel idAutor) {
        this.autor = idAutor;
    }

    public EditorialModel getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialModel editorial) {
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        
    @Override
    public String toString() {
        return "LibroModel{" + "titulo=" + titulo + ", Sinopsis=" + sinopsis + ", urlImage=" + urlImage + ", isbn=" + isbn + ", a\u00f1oPublicacion=" + anioPublicacion + ", idAutor=" + id + ", idEditorial=" + editorial + '}';
    }
    

    

    
   
    
    
}
