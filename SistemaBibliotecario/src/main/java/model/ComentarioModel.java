package model;

import java.util.Calendar;

public class ComentarioModel {
    private int idComentario;
    private int idUsuario;
    private int idLibro;
    private String texto;
    private Calendar fechaNacimiento;
    private int idAdministrador;

    public ComentarioModel() {
    }

    public ComentarioModel(int idComentario, int idUsuario, int idLibro, String texto, Calendar fechaNacimiento, int idAdministrador) {
        this.idComentario = idComentario;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.texto = texto;
        this.fechaNacimiento = fechaNacimiento;
        this.idAdministrador = idAdministrador;
    }

    public ComentarioModel(int idUsuario, int idLibro, String texto, Calendar fechaNacimiento, int idAdministrador) {
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.texto = texto;
        this.fechaNacimiento = fechaNacimiento;
        this.idAdministrador = idAdministrador;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Comentario{" + "idComentario=" + idComentario + ", idUsuario=" + idUsuario + ", idLibro=" + idLibro + ", texto=" + texto + ", fechaNacimiento=" + fechaNacimiento + ", idAdministrador=" + idAdministrador + '}';
    }
    
    
}
