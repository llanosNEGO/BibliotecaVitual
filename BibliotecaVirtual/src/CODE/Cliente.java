/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Nego
 */
public class Cliente extends Usuario {

    public Cliente(int id, String nombre, String apellidos, String rol, String password) {
        super(id, nombre, apellidos, rol, password);
    }

    @Override
    public String toString() {
        return super.toString()+ "Trabajador{" + '}';
    }
    
}
