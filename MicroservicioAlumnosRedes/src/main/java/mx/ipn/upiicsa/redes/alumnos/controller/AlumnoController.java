package mx.ipn.upiicsa.redes.alumnos.controller;

import java.util.Arrays;
import java.util.List;
import mx.ipn.upiicsa.redes.alumnos.entitys.Alumno;
import mx.ipn.upiicsa.redes.alumnos.service.IAlumnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upiicsa/aplicacionredes")
public class AlumnoController {
    
    @Autowired
    private IAlumnosService iAlumnoService;
    
    @GetMapping("/alumnosf")
    public List<Alumno> listaAlumnosF(){
        return Arrays.asList(new Alumno(2019601967,"Brian","Antonio","Cisneros","AplicacionRedes"),new Alumno(2013130729,"Kevin","Antonio","Cisneros","AplicacionRedes"));
    }
    
    @GetMapping("/alumnos")
    public List<Alumno> listaAlumnos(){
        return iAlumnoService.listarAlumnos();
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/crear")
    public Alumno guardarAlumno(@RequestBody Alumno alumno){
        return iAlumnoService.guardarAlumno(alumno);
    }
    
}
