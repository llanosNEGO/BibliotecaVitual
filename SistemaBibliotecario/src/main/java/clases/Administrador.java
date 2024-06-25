package clases;

public class Administrador extends Persona{

    public Administrador() {
    }

    public Administrador(int codigo, String nombre, String email, String contraseña) {
        super(codigo, nombre, email, contraseña);
    }

    public Administrador(String nombre, String email, String contraseña) {
        super(nombre, email, contraseña);
    }

    @Override
    public String toString() {
        return "Administrador{" + super.toString()+'}';
    }

}
