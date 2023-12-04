package example.hibernate.pyme.models;
import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Table(name="servicio_contratado")
@Setter @Getter @NoArgsConstructor
public class ServicioContratado implements Serializable{
	@Transient
	private static final long serialVersionUID = 8438118305668394283L;

    @Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

    @ManyToOne(fetch=FetchType.EAGER)    
	@JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente cliente;

    @Column(name="fechaInicio")
    private Date fechaInicio;

    @Column(name="fechaVto")
    private Date fechaVto;

    @Column(name="horasConsumidas")
    private int horasConsumidas;

   @ManyToOne(fetch=FetchType.EAGER)    
	@JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;
// Servicio servicio,
    public ServicioContratado(Cliente cliente   , Date fechaInicio, Date fechaVto, int horasConsumidas , Servicio servicio) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaVto = fechaVto;
        this.horasConsumidas = horasConsumidas;
        this.servicio = servicio;
    }
    @Override
    public String toString() {
        return "ServicioContratado{" + "id=" + id + ", cliente=" + cliente + ", fechaInicio=" + fechaInicio + ", fechaVto=" + fechaVto + ", horasConsumidas=" + horasConsumidas + ", servicio=" + servicio + '}';
    }
   
}
