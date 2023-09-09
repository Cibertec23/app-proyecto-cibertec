package pe.edu.cibertec.appproyectocibertec.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.cibertec.appproyectocibertec.model.bd.pk.PagosId;

import java.util.Date;

@Getter @Setter @NoArgsConstructor
@IdClass(PagosId.class)
@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    private String idalumno;
    @Id
    private String ciclo;
    @Id
    private Integer ncuota;
    @Column(name = "monto")
    private Double monto;
    @Column(name = "fecha")
    private Date fecha;

}
