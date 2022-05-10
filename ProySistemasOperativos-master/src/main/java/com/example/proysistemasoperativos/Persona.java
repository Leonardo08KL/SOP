package com.example.proysistemasoperativos;


import java.time.LocalTime;

public class Persona {
    private String nombre;
    private Integer noControl;
    private String cubrebocas;
    private LocalTime entra;
    private LocalTime sale;

    public Persona(String nombre, Integer noControl, String cubrebocas, LocalTime entra, LocalTime sale) {
        this.nombre = nombre;
        this.noControl = noControl;
        this.cubrebocas = cubrebocas;
        this.entra = entra;
        this.sale = sale;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNoControl() {
        return noControl;
    }

    public void setNoControl(Integer noControl) {
        this.noControl = noControl;
    }

    public String getCubrebocas() {
        return cubrebocas;
    }

    public void setCubrebocas(String cubrebocas) {
        this.cubrebocas = cubrebocas;
    }

    public LocalTime getEntra() {
        return entra;
    }
    
    public void setEntra(LocalTime entra) {
        this.entra = entra;
    }

    public void setSale(LocalTime sale) {
        this.sale = sale;
    }

    public LocalTime getSale() {
        return sale;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", noControl=" + noControl +
                ", cubrebocas='" + cubrebocas + '\'' +
                ", entra=" + entra +
                ", sale=" + sale +
                '}';
    }
}
