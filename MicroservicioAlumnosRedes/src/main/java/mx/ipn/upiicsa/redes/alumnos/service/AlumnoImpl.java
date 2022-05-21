package mx.ipn.upiicsa.redes.alumnos.service;

import java.util.List;
import mx.ipn.upiicsa.redes.alumnos.dao.IAlumnosDao;
import mx.ipn.upiicsa.redes.alumnos.entitys.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoImpl implements IAlumnosService{

    @Autowired
    private IAlumnosDao iAlumnoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Alumno> listarAlumnos() {
       return iAlumnoDao.findAll();
    }

    @Override
    public Alumno guardarAlumno(Alumno alumno) {
        return iAlumnoDao.save(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        iAlumnoDao.delete(alumno);
    }
    
}
