package com.innovatech.e_commerce.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovatech.e_commerce.entity.Event;

@RestController
@RequestMapping("/api/bazares")
public class EventController {

    private List<Event> bazares = new ArrayList<>();

    public EventController() {
        bazares.add(new Event(1, "Bazar de Emprendedores", "01/11/2024", "05/11/2024", "Presencial", 10));
        bazares.add(new Event(2, "Bazar Virtual de Moda", "15/12/2024", "20/12/2024", "Virtual", 20));
        bazares.add(new Event(3, "Bazar de Comida", "15/12/2024", "20/12/2024", "Virtual", 20));
        bazares.add(new Event(4, "Bazar Presencial de Moda", "15/12/2024", "20/12/2024", "Virtual", 20));
        bazares.add(new Event(5, "Bazar Virtual de Tecnología", "15/12/2024", "20/12/2024", "Virtual", 20));
        bazares.add(new Event(6, "Bazar Virtual de Moda", "15/12/2024", "20/12/2024", "Virtual", 20));
        bazares.add(new Event(7, "Bazar Virtual de Moda", "15/12/2024", "20/12/2024", "Virtual", 20));
    }

    @GetMapping
    public Page<Event> getBazares(Pageable pageable) {
        int start = (int) pageable.getOffset();
        int end = Math.min(start + pageable.getPageSize(), bazares.size());
        List<Event> paginatedList = bazares.subList(start, end);
        return new PageImpl<>(paginatedList, pageable, bazares.size());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getBazarById(@PathVariable int id) {
        return bazares.stream()
                .filter(bazar -> bazar.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
