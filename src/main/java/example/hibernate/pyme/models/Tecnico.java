package example.hibernate.pyme.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TECNICOS")
@Setter
@Getter
@NoArgsConstructor
public class Tecnico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idTecnico;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "medio_comunicacion", length = 50, nullable = false)
    private String medioComunicacion;

    @ManyToMany
    @JoinTable(
        name = "tecnico_especialidad",
        joinColumns = @JoinColumn(name = "tecnico_id"),
        inverseJoinColumns = @JoinColumn(name = "especialidad_id")
    )
    private List<Especialidad> especialidadServicio;

    @ManyToMany
    @JoinTable(
        name = "tecnico_incidente",
        joinColumns = @JoinColumn(name = "tecnico_id"),
        inverseJoinColumns = @JoinColumn(name = "incidente_id")
    )
    private List<Incidente> incidente;

    @OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
    private List<Mensaje> mensaje;

    @ManyToMany
    @JoinTable(
        name = "tecnico_servicio",
        joinColumns = @JoinColumn(name = "tecnico_id"),
        inverseJoinColumns = @JoinColumn(name = "servicio_id")
    )
    private List<Servicio> servicio;

    public Tecnico( String nombre, String apellido, String medioComunicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioComunicacion = medioComunicacion;
        //this.especialidadServicio = especialidadServicio;
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


