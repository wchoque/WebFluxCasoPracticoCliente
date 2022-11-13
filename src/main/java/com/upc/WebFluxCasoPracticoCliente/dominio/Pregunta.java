package com.upc.WebFluxCasoPracticoCliente.dominio;

public class Pregunta {
    private Long id;
    private String descripcion;
    private int orden;
    private int dificultad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public Pregunta(Long id, String descripcion, int orden, int dificultad) {
        this.id = id;
        this.descripcion = descripcion;
        this.orden = orden;
        this.dificultad = dificultad;
    }

    public Pregunta() {
    }
}