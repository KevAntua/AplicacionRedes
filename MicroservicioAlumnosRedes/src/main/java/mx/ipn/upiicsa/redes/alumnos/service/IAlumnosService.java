package mx.ipn.upiicsa.redes.alumnos.service;

import java.util.List;
import mx.ipn.upiicsa.redes.alumnos.entitys.Alumno;

public interface IAlumnosService {
    
    public List<Alumno> listarAlumnos();
    
    public Alumno guardarAlumno (Alumno alumno);
    
    public void eliminarAlumno (Alumno alumno);
    
}
