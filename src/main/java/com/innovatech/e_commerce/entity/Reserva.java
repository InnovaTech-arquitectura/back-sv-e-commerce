package com.innovatech.e_commerce.entity;

public class Reserva {
    private Long id;
    private String servicio;
    private String fechaInicio;
    private String fechaFinal;
    private String emprendimiento;
    private double precio;

    public Reserva(Long id, String servicio, String fechaInicio, String fechaFinal, String emprendimiento, double precio) {
        this.id = id;
        this.servicio = servicio;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.emprendimiento = emprendimiento;
        this.precio = precio;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEmprendimiento() {
        return emprendimiento;
    }

    public void setEmprendimiento(String emprendimiento) {
        this.emprendimiento = emprendimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
