package com.innovatech.e_commerce.controller;

import com.innovatech.e_commerce.entity.Reserva;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReservaController {

    private List<Reserva> reservas = new ArrayList<>();

    public ReservaController() {
        // Datos mockeados
        reservas.add(new Reserva(1, "Catering", "19-11-2024", "19-11-2024", "Home", 100.0));
        reservas.add(new Reserva(2, "Fotografía", "31-3-2024", "31-3-2024", "StudioFlash", 250.0));
        reservas.add(new Reserva(3, "Decoración", "15-4-2024", "16-4-2024", "ArtDeco", 300.0));
        reservas.add(new Reserva(4, "Música en vivo", "20-5-2024", "20-5-2024", "MusicWorld", 500.0));
        reservas.add(new Reserva(5, "Animación", "05-6-2024", "06-6-2024", "FunParty", 150.0));
        reservas.add(new Reserva(6, "Seguridad", "22-7-2024", "23-7-2024", "SafeGuard", 200.0));
        reservas.add(new Reserva(7, "Sonido", "07-8-2024", "07-8-2024", "SoundPro", 400.0));
        reservas.add(new Reserva(8, "Iluminación", "25-9-2024", "26-9-2024", "LightShow", 350.0));
        reservas.add(new Reserva(9, "Transporte", "12-10-2024", "12-10-2024", "MoveFast", 180.0));
    }

    @GetMapping("/api/reservas")
    public List<Reserva> getAllReservas() {
        return reservas;
    }

    @GetMapping("/api/reservas/{id}")
    public Reserva getReservaById(@PathVariable Long id) {
        return reservas.stream()
                .filter(reserva -> reserva.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
