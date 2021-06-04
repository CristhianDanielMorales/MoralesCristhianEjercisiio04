package com.example.moralescristhianejercisiio04.entity;

public class Sala {

    private int IdSala;
    private String numero;
    private int piso;
    private String capacidad;
    private String recursos;
    private int estado;

    public int getIdSala() {
        return IdSala;
    }

    public void setIdSala(int idSala) {
        IdSala = idSala;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
