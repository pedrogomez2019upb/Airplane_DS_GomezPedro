package edu.upb.ds.Airplane;

public class Avion {
    private int id;
    private String puesto;
    private String categoria;
    private int valor;

    public Avion(){}

    public Avion(int id, String puesto, String categoria, int valor) {
        this.id = id;
        this.puesto = puesto;
        this.categoria = categoria;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", puesto='" + puesto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +
                '}';
    }
}
