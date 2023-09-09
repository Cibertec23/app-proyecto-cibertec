package pe.edu.cibertec.appproyectocibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appproyectocibertec.model.bd.Notas;
import pe.edu.cibertec.appproyectocibertec.model.bd.pk.NotasId;

@Repository
public interface NotasRepository
        extends JpaRepository<Notas, NotasId> {

}
