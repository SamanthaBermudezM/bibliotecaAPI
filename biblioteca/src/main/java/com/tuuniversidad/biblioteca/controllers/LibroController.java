package com.tuuniversidad.biblioteca.controllers;

import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> getAllLibros() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable("id") Long id) {
        return libroService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Void> createLibro(@RequestBody Libro libro) {
        libroService.save(libro);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}