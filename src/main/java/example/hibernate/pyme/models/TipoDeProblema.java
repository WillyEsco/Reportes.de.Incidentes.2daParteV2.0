package example.hibernate.pyme.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tipos_de_problema")
@Setter
@Getter
@NoArgsConstructor
public class TipoDeProblema implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int IdTipoProblema;

    @Column(name="nombre",length=50,nullable=false)
    private String nombre;
    @Column(name="descripcion",length=250,nullable=false)
    private String descripcion;
    @ManyToMany
    @JoinColumn(name="id")
    private List<Especialidad> especialidades;
    @ManyToMany
    @JoinColumn(name = "idServicio")
    private List<Servicio> servicios;

    public TipoDeProblema(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoDeProblema{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
