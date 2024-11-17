package com.innovatech.e_commerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovatech.e_commerce.entity.Capacitacion;

@RestController
@RequestMapping("/api/courses")
public class CapacitacionController {

    private List<Capacitacion> courses = new ArrayList<>();
 

    @GetMapping("/api/courses")
    public List<Capacitacion> getAllCourses() {
        courses.add(new Capacitacion(1L, "Cap_Finanzas", "15/12/2024", "Online", "Curso de finanzas básicas", "https://teams.microsoft.com/...", 4.5));
        courses.add(new Capacitacion(2L, "Cap_Ventas", "18/12/2024", "Presencial", "Estrategias para mejorar tus ventas", "https://teams.microsoft.com/...", 4.0));
        courses.add(new Capacitacion(3L, "Cap_Marketing", "20/12/2024", "Online", "Marketing digital para emprendedores", "https://teams.microsoft.com/...", 4.7));
        courses.add(new Capacitacion(4L, "Cap_Llegar a mas clientes", "22/12/2024", "Presencial", "Cómo llegar a más clientes", "https://teams.microsoft.com/...", 3.8));
        courses.add(new Capacitacion(5L, "Cap_Redes Sociales", "25/12/2024", "Online", "Estrategias en redes sociales", "https://teams.microsoft.com/...", 4.9));
        return courses;
    }

    @GetMapping("/api/courses/{id}")
    public Capacitacion getCourseById(@PathVariable Long id) {
        courses.add(new Capacitacion(1L, "Cap_Finanzas", "15/12/2024", "Online", "Curso de finanzas básicas", "https://teams.microsoft.com/...", 4.5));
        courses.add(new Capacitacion(2L, "Cap_Ventas", "18/12/2024", "Presencial", "Estrategias para mejorar tus ventas", "https://teams.microsoft.com/...", 4.0));
        courses.add(new Capacitacion(3L, "Cap_Marketing", "20/12/2024", "Online", "Marketing digital para emprendedores", "https://teams.microsoft.com/...", 4.7));
        courses.add(new Capacitacion(4L, "Cap_Llegar a mas clientes", "22/12/2024", "Presencial", "Cómo llegar a más clientes", "https://teams.microsoft.com/...", 3.8));
        courses.add(new Capacitacion(5L, "Cap_Redes Sociales", "25/12/2024", "Online", "Estrategias en redes sociales", "https://teams.microsoft.com/...", 4.9));
        return courses.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
