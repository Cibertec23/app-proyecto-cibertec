package pe.edu.cibertec.appproyectocibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appproyectocibertec.model.bd.Pagos;
import pe.edu.cibertec.appproyectocibertec.model.bd.pk.PagosId;

@Repository
public interface PagosRepository
        extends JpaRepository<Pagos, PagosId> {
}
