package Proyecto.Interfaces;

import Biblioteca.entidades.Calificacion;

public interface CalificacionServicio {

    Calificacion agregarCalificacion (String libroIsbn, Integer calificacion) throws Exception;
}
