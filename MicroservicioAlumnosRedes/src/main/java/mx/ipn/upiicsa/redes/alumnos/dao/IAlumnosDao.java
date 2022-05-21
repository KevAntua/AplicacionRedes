package mx.ipn.upiicsa.redes.alumnos.dao;

import mx.ipn.upiicsa.redes.alumnos.entitys.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Kev Antua
 */
public interface IAlumnosDao extends JpaRepository <Alumno,Integer> {
    
}
