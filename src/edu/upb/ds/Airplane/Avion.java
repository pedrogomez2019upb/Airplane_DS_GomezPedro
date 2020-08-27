package edu.upb.ds.Airplane;

import java.util.Date;

public class Avion {
    private int id;
    private int puesto;
    private String origen;
    private String destino;
    private Date hora_salida;

    public Avion(){}

    public Avion(int id, int puesto, String origen, String destino, Date hora_salida) {
        this.id = id;
        this.puesto = puesto;
        this.origen = origen;
        this.destino = destino;
        this.hora_salida = hora_salida;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", puesto='" + puesto + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", hora_salida=" + hora_salida +
                '}';
    }
}
