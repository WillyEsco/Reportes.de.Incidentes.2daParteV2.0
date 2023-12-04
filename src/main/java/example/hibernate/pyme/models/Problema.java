package example.hibernate.pyme.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="problemas")
@Setter
@Getter
@NoArgsConstructor
public class Problema implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idProblema;
    
    @ManyToOne
    @JoinColumn(name="IdTipoProblema")
    private TipoDeProblema tipoDeProblema;
    @Column(name="nombre",length=50,nullable=false)
    private String nombre;
    @Column(name="descripcion",length=250,nullable=false)
    private String descripcion;
    @Column(name="tiempo_de_resolucion",nullable = false)

    private Integer tiempoResolucion;//horas

    public Problema(String nombre, String descripcion, Integer tiempoResolucion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempoResolucion = tiempoResolucion;
    }

    @Override
    public String toString() {
        return "Problema{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
