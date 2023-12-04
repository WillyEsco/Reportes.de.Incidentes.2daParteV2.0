package example.hibernate.pyme.models;
import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="SERVICIOS")
@Setter @Getter @NoArgsConstructor
public class Servicio implements Serializable {
	@Transient
	private static final long serialVersionUID = 8438118305668394283L;
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;

    @Column(name="nombre",length=80,nullable=false)
    private String nombre;

   @Column(name="descripcion",length=200)
    private String descripcion;

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "idServicio=" + Id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
}
