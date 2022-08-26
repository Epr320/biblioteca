package co.edu.uniquindio.unitravel.entidades;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Libro {
    @Id
    @EqualsAndHashCode.Include
    @NotBlank
    @Length(min=10, max=10,message ="La cedula debe tener 10 caracteres.")
    private String isbn;

    @Column(nullable = false)
    @Length(min=3, max=15,message ="El nombre debe tener entre 3 y 15 caracteres.")
    @NotBlank
    private String nombre;

    @Column(nullable = false)
    @Length(min=3, max=15,message ="El nombre debe tener entre 3 y 15 caracteres.")
    @NotBlank
    private String descri;

    @ManyToOne
    private Autor autor;


    @OneToMany(mappedBy = "libro")
    private List<Reseña> reseñas;

    @OneToMany(mappedBy = "libro")
    private List<Calificacion> calificaciones;
}
