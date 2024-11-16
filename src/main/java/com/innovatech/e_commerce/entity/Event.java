package com.innovatech.e_commerce.entity;

public class Event {
    private int id;
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private String modalidad;
    private int localesDisponibles;

    public Event(int id, String nombre, String fechaInicio, String fechaFin, String modalidad, int localesDisponibles) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.modalidad = modalidad;
        this.localesDisponibles = localesDisponibles;
    }

    public Event() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getLocalesDisponibles() {
        return localesDisponibles;
    }

    public void setLocalesDisponibles(int localesDisponibles) {
        this.localesDisponibles = localesDisponibles;
    }

}
