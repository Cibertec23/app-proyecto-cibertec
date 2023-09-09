package pe.edu.cibertec.appproyectocibertec.model.bd.pk;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class PagosId implements Serializable {
    private String idalumno;
    private String ciclo;
    private Integer ncuota;
}
