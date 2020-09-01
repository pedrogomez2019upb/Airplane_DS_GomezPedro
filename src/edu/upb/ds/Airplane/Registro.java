package edu.upb.ds.Airplane;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Registro {
    private int id_registro;
    private LocalDateTime fecha_compra;
    private String nombre_pasajero;
    private String apellido_pasajero;
    private String tipo_identificacion;
    private String identificacion;
    private String direccion;
    private int celular;
    private int asiento;
    private String categoria;
    private int precio;
    private Object avion;

    public Registro(){}

    public Registro(int id_registro, LocalDateTime fecha_compra, String nombre_pasajero, String apellido_pasajero, String tipo_identificacion, String identificacion, String direccion, int celular, int asiento, String categoria, int precio, Object avion) {
        this.id_registro = id_registro;
        this.fecha_compra = fecha_compra;
        this.nombre_pasajero = nombre_pasajero;
        this.apellido_pasajero = apellido_pasajero;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.celular = celular;
        this.asiento = asiento;
        this.categoria = categoria;
        this.precio = precio;
        this.avion = avion;
    }

    public Object getAvion() {
        return avion;
    }

    public void setAvion(Object avion) {
        this.avion = avion;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public LocalDateTime getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDateTime fecha_compra) {
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
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

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id_registro=" + id_registro +
                ", fecha_compra=" + fecha_compra +
                ", nombre_pasajero='" + nombre_pasajero + '\'' +
                ", apellido_pasajero='" + apellido_pasajero + '\'' +
                ", tipo_identificacion='" + tipo_identificacion + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", celular=" + celular +
                ", asiento='" + asiento + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", avion=" + avion +
                '}';
    }
}
