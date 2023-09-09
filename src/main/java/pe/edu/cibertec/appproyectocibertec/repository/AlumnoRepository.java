package pe.edu.cibertec.appproyectocibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appproyectocibertec.model.bd.Alumno;

@Repository
public interface AlumnoRepository
        extends JpaRepository<Alumno, String> {

}
