package com.innovatech.e_commerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovatech.e_commerce.entity.Capacitacion;

@RestController
@RequestMapping("/api/courses")
public class CapacitacionController {

    private List<Capacitacion> courses = new ArrayList<>();

    // Inicializamos la lista en el constructor
    public CapacitacionController() {
        courses.add(new Capacitacion(1L, "Cap_Finanzas", "15/12/2024", "Online", "Curso de finanzas básicas", "https://teams.microsoft.com/...", 4.5));
        courses.add(new Capacitacion(2L, "Cap_Ventas", "18/12/2024", "Presencial", "Estrategias para mejorar tus ventas", "https://teams.microsoft.com/...", 4.0));
        courses.add(new Capacitacion(3L, "Cap_Marketing", "20/12/2024", "Online", "Marketing digital para emprendedores", "https://teams.microsoft.com/...", 4.7));
        courses.add(new Capacitacion(4L, "Cap_Llegar a mas clientes", "22/12/2024", "Presencial", "Cómo llegar a más clientes", "https://teams.microsoft.com/...", 3.8));
        courses.add(new Capacitacion(5L, "Cap_Redes Sociales", "25/12/2024", "Online", "Estrategias en redes sociales", "https://teams.microsoft.com/...", 4.9));
    }

    // Endpoint para obtener todos los cursos
    @GetMapping
    public List<Capacitacion> getAllCourses() {
        return courses;
    }

    // Endpoint para obtener un curso por ID
    @GetMapping("/{id}")
    public ResponseEntity<Capacitacion> getCourseById(@PathVariable Long id) {
        Optional<Capacitacion> course = courses.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();

        return course.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
