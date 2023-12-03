package example.hibernate.pyme.models;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="SERVICIOS")
@Setter @Getter @NoArgsConstructor
public class Servicio implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idServicio;

    @Column(name="nombre",length=80,nullable=false)
    private String nombre;

    @OneToMany(mappedBy="Servicio")
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private List<ServicioContratado> serviciosContratados;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }

    @OneToMany
	@JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;

    @Override
    public String toString() {
        return "Servicio{" + "idServicio=" + idServicio + ", nombre=" + nombre + '}';
    }
    
    
}
