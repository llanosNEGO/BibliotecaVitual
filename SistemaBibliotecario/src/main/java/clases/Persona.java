package clases;

public abstract class Persona {
    private int codigo;
    private String nombre;
    private String email;
    private String contraseña;

    public Persona() {
    }

    public Persona(int codigo, String nombre, String email, String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public Persona(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + '}';
    }

}
