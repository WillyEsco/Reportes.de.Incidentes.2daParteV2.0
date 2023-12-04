package example.hibernate.pyme.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ESPECIALIDAD")
@Getter
@Setter
@NoArgsConstructor
public class Especialidad implements Serializable {

    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre",length=80,nullable=false)
    private String nombre;
    
    @Column(name="descripcion",length=80,nullable=false)
    private String descripcion;
    
    @OneToMany
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private List<Servicio> servicios;

    public Especialidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    
    }

    @Override
    public String toString() {
        return "Especialidad{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
