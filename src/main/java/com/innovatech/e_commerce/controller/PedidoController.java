package com.innovatech.e_commerce.controller;

import com.innovatech.e_commerce.entity.Pedido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PedidoController {

    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoController() {
        // Datos mockeados
        pedidos.add(new Pedido(1L, "ABCD", 150.0, "Aceptado", "Calle Falsa 123", "Antioquia", "Medellín"));
        pedidos.add(new Pedido(2L, "XYZ", 200.0, "En camino", "Avenida Siempre Viva 742", "Cundinamarca", "Bogotá"));
        pedidos.add(new Pedido(3L, "QWERTY", 300.0, "Entregado", "Calle de la Rosa", "Santander", "Bucaramanga"));
        pedidos.add(new Pedido(4L, "MNOP", 120.0, "Pendiente", "Carrera 45", "Antioquia", "Medellín"));
        pedidos.add(new Pedido(5L, "SEBO", 100.0, "Aceptado", "Alvaro Uribe", "Presidente", "Colombia"));

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
