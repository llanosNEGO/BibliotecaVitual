package clases;

public class Administrador {
    private int idAdministrador;
    private String nombre;
    private String email;
    private String contraseña;

    public Administrador() {
    }

    public Administrador(int idAdministrador, String nombre, String email, String contraseña) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public Administrador(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + ", nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    

}
