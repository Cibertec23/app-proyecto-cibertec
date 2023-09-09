package pe.edu.cibertec.appproyectocibertec.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Embeddable
public class NotasId implements Serializable {

    private String idalumno;
    private String idcurso;

}
