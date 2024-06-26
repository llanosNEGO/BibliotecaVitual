
package model;

public class AutorModel {
    private int idAutor;
    private String nombre;

    public AutorModel() {
    }

    public AutorModel(int idAutor, String nombre) {
        this.idAutor = idAutor;
        this.nombre = nombre;
    }

    public AutorModel(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", nombre=" + nombre + '}';
    }
    
    
}
