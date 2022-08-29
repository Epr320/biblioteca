package Proyecto.Interfaces;

import Biblioteca.entidades.Reseña;

public interface ReseñaServicio {
    Reseña agregarReseña (String libroIsbn, String contenido) throws Exception;
}
