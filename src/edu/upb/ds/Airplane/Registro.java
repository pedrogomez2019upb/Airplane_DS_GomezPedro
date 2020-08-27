package edu.upb.ds.Airplane;

import java.util.Date;

public class Registro {
    private int id_registro;
    private Date fecha_compra;
    private String nombre_pasajero;
    private String apellido_pasajero;
    private String tipo_identificacion;
    private int identificacion;
    private String direccion;
    private int celular;
    private String asiento;

    public Registro(){}

    public Registro(int id_registro, Date fecha_compra, String nombre_pasajero, String apellido_pasajero, String tipo_identificacion, int identificacion, String direccion, int celular,String asiento) {
        this.id_registro = id_registro;
        this.fecha_compra = fecha_compra;
        this.nombre_pasajero = nombre_pasajero;
        this.apellido_pasajero = apellido_pasajero;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.celular = celular;
        this.asiento=asiento;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    public String getApellido_pasajero() {
        return apellido_pasajero;
    }

    public void setApellido_pasajero(String apellido_pasajero) {
        this.apellido_pasajero = apellido_pasajero;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id_registro=" + id_registro +
                ", fecha_compra=" + fecha_compra +
                ", nombre_pasajero='" + nombre_pasajero + '\'' +
                ", apellido_pasajero='" + apellido_pasajero + '\'' +
                ", tipo_identificacion='" + tipo_identificacion + '\'' +
                ", identificacion=" + identificacion +
                ", direccion='" + direccion + '\'' +
                ", celular=" + celular +
                ", asiento='" + asiento + '\'' +
                '}';
    }
}
