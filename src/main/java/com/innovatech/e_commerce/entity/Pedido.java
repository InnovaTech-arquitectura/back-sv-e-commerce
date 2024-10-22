package com.innovatech.e_commerce.entity;

public class Pedido {
    private Long id;
    private String emprendimiento;
    private double precio;
    private String estado;
    private String direccion;
    private String departamento;
    private String ciudad;

    public Pedido(Long id, String emprendimiento, double precio, String estado, String direccion, String departamento, String ciudad) {
        this.id = id;
        this.emprendimiento = emprendimiento;
        this.precio = precio;
        this.estado = estado;
        this.direccion = direccion;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
