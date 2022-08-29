package Biblioteca.Repositorios;

import Biblioteca.entidades.Calificacion;
import Biblioteca.entidades.Reseña;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionRepo extends JpaRepository<Calificacion, Integer> {

}
