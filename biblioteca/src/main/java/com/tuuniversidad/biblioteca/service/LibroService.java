package com.tuuniversidad.biblioteca.service;

import com.tuuniversidad.biblioteca.exceptions.LibroException;
import com.tuuniversidad.biblioteca.models.Libro;
import com.tuuniversidad.biblioteca.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> findAll() {
        return libroRepository.findAll();
    }

    public Optional<Libro> findById(Long id) {
        Optional<Libro> libro = libroRepository.findById(id);
        if (libro == null) {
            throw new LibroException("Libro con ID " + id + " no encontrado");
        }
        return libro;
    }

    public void save(Libro libro) {
        libroRepository.save(libro);
    }

    public List<Libro> getAllLibros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllLibros'");
    }

    public Optional<Libro> getLibroById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLibroById'");
    }

    public void addLibro(Libro libro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLibro'");
    }
}
