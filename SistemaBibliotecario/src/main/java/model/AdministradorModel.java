package model;

public class AdministradorModel extends PersonaModel{

    public AdministradorModel() {
    }

    public AdministradorModel(int codigo, String nombre, String email, String contraseña) {
        super(codigo, nombre, email, contraseña);
    }

    public AdministradorModel(String nombre, String email, String contraseña) {
        super(nombre, email, contraseña);
    }

    @Override
    public String toString() {
        return "Administrador{" + super.toString()+'}';
    }

}
