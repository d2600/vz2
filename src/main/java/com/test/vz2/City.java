package com.test.vz2;

public class City {
    private String nombre;
    private long poblacion;

    public City() {
    }

    public City(String nombre, long poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }
}