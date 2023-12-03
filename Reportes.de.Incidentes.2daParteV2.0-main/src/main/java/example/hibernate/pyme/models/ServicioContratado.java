package example.hibernate.pyme.models;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Table(name="SERVICIOS-CONTRATADOS")
@Setter @Getter @NoArgsConstructor
public class ServicioContratado implements Serializable {

    @Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

    @ManyToOne 
	@JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente cliente;

    @Column(name="fechaInicio",nullable=false)
    private Date fechaInicio;

    @Column(name="fechaVto",nullable=false)
    private Date fechaVto;

    @Column(name="horasConsumidas")
    private int horasConsumidas;

    public ServicioContratado(Servicio servicio, Cliente cliente, Date fechaInicio, Date fechaVto, int horasConsumidas) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaVto = fechaVto;
        this.horasConsumidas = horasConsumidas;
    }

   
}
