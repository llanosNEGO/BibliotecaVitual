package model;

public class EditorialModel {
    private int idEditorial;
    private String nombre;

    public EditorialModel() {
    }

    public EditorialModel(int idEditorial, String nombre) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
    }

    public EditorialModel(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "idEditorial=" + idEditorial + ", nombre=" + nombre + '}';
    }
    
    
}
