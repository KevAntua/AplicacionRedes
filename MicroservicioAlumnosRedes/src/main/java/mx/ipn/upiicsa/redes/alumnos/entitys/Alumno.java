package mx.ipn.upiicsa.redes.alumnos.entitys;
import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Kev Antua
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblAlumnos")
public class Alumno implements Serializable {

    private static final long serialVersionUID =  1L;
    
    @Id
    private int boleta;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellidoP")
    private String apellidoP;
    @Column(name="apellidoM")
    private String apellidoM;
    @Column(name="materia")
    private String materia;
    
}
