package Proyecto.Interfaces;

import Biblioteca.entidades.Libro;

import java.util.List;

public interface LibroServicio {


    List<Libro> buscarLibroPorNombre (String nombre) throws Exception;
    List<Libro> buscarLibroPorAutor (String nombre) throws Exception;
    List<Libro> buscarLibroPorIsbn (String nombre) throws Exception;

}
