package co.edu.uniquindio.proyecto.entidades;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Estado implements Serializable {

    //primary key comentario
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(length = 50 , nullable = false, unique = true)
    @NotBlank(message = "El estado debe tener nombre")
    private String nombre;
}
