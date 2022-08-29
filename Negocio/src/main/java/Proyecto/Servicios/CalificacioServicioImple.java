package Proyecto.Servicios;

import Biblioteca.Repositorios.CalificacionRepo;
import Biblioteca.Repositorios.LibroRepo;
import Biblioteca.entidades.Calificacion;
import Proyecto.Interfaces.CalificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacioServicioImple implements CalificacionServicio {
    @Autowired
    CalificacionRepo calificacionRepo;

    @Autowired
    LibroRepo libroRepo;

    @Override
    public Calificacion agregarCalificacion(String libroIsbn, Integer calificacion) throws Exception {


        Calificacion calificacion1 = new Calificacion();
        calificacion1.setCalificacion(calificacion);
        calificacion1.setLibro(libroRepo.getById(libroIsbn));
        return calificacionRepo.save(calificacion1);
    }
}
