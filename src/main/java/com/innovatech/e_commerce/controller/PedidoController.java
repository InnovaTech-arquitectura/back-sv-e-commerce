package com.innovatech.e_commerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.innovatech.e_commerce.entity.Pedido;

@RestController
public class PedidoController {

    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoController() {
        // Datos mockeados
        pedidos.add(new Pedido(1, "ABCD", 150.0, "Aceptado", "Calle Falsa 123", "Antioquia", "Medellín"));
        pedidos.add(new Pedido(2, "XYZ", 200.0, "En camino", "Avenida Siempre Viva 742", "Cundinamarca", "Bogotá"));
        pedidos.add(new Pedido(3, "QWERTY", 300.0, "Entregado", "Calle de la Rosa", "Santander", "Bucaramanga"));
        pedidos.add(new Pedido(4, "MNOP", 120.0, "Pendiente", "Carrera 45", "Antioquia", "Medellín"));
        pedidos.add(new Pedido(5, "SEBO", 100.0, "Aceptado", "Alvaro Uribe", "Presidente", "Colombia"));

    }


    @GetMapping("/api/pedidos")
    public List<Pedido> getAllPedidos() {
        return pedidos;
    }

    @GetMapping("/api/pedidos/{id}")
    public Pedido getPedidoById(@PathVariable Long id) {
        return pedidos.stream()
                .filter(pedido -> pedido.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
