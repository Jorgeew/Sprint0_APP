package com.jorge.sprint0_jorgelarrosaquesada;

public class Medida {
    private float valor;
    private String tiempo;
    private String nombre_sensor;
    private Coordenada coordenada;

    public Medida(String id, float valor, String tiempo, String nombre_sensor, Coordenada coordenada) {
        this.valor = valor;
        this.tiempo = tiempo;
        this.nombre_sensor = nombre_sensor;
        this.coordenada = coordenada;

    }

    public Medida() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre_sensor() {
        return nombre_sensor;
    }

    public void setNombre_sensor(String nombre_sensor) {
        this.nombre_sensor = nombre_sensor;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }
}
