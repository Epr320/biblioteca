package Biblioteca.Repositorios;

import Biblioteca.entidades.Reseña;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseñaRepo extends JpaRepository<Reseña, Integer> {
}
