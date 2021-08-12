package com.firthuns.recyclerview_eje10.modelos;

public class Ordenador {

    private String marca;
    private String modelo;
    private int ram;
    private float velocidadProcesador;

    public Ordenador(String marca, String modelo, int ram, float velocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.velocidadProcesador = velocidadProcesador;
    }

    public Ordenador() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(float velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }
}
