package example.hibernate.pyme.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="TECNICOS")
@Setter @Getter @NoArgsConstructor
public class Tecnico implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTecnico;
    
    @Column(name="nombre",length=50,nullable=false)
    private String nombre;
    
    @Column(name="apellido",length=50,nullable=false)
    private String apellido;
    
    @Column(name="medio_comunicacion",length=50,nullable=false)
    private String medioComunicacion;
    
    @ManyToMany
    @JoinColumn(name="especialidad_id", referencedColumnName="id")
    private List<Especialidad> especialidadServicio;

    public Tecnico( String nombre, String apellido, String medioComunicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioComunicacion = medioComunicacion;
        //this.especialidadServicio = especialidadServicio;
    }

    public void determinarMedioComunicacion(int idTecnico){

    }
    public void sendNotificacion(String medioComunicacion, String mensaje){

    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "idTecnico=" + idTecnico +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", medioComunicacion='" + medioComunicacion + '\'' +
                '}';
    }
}
