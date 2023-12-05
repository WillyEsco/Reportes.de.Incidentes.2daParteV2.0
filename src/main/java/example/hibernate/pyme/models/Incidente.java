package example.hibernate.pyme.models;
import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 

import java.time.LocalDateTime;
import java.time.LocalTime;
 


@Entity
@Table(name="incidentes")
@Getter @Setter @NoArgsConstructor
public class Incidente implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int incidenteID;

    @Column(name="fechaCreacion")
    private LocalDateTime fechaCreacion;

    @OneToOne
    @JoinColumn(name="tecnico_id", referencedColumnName="id")
    private Tecnico tecnico;

    @Column(name="fechaAsignacion")
    private LocalDateTime fechaAsignacion;

    @Column(name="consideracion",length=250,nullable=false)
    private String consideracion;

    @Column(name="estado",length=30,nullable=false)
    private String estado;

    @Column(name="descripcionCliente",length=250,nullable=false)
    private String descripcionCliente;

    @OneToOne   
    //un incidente tiene un problema 
    private  Problema problema; 

    @OneToOne
    @JoinColumn(name="servicio_id", referencedColumnName="id")
    private Servicio servicio;

    @Column(name="complejidadAlta")
    private boolean complejidadAlta;

    @Column(name="tiempoUtilizadoTecnico")
    private LocalTime tiempoUtilizadoTecnico;

    @Column(name="tiempoEstimadoSistema")
    private LocalTime tiempoEstimadoSistema;

    @Column(name="tiempoExtra")
    private LocalTime tiempoExtra;

    @ManyToOne //un cliente puede tener muchos incidentes
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente cliente;

    public Incidente(LocalDateTime fechaCreacion, Tecnico tecnico, LocalDateTime fechaAsignacion, String consideracion,
                     String estado, String descripcionCliente, Problema problema, Servicio servicio, boolean complejidadAlta,
                     LocalTime tiempoUtilizadoTecnico, LocalTime tiempoEstimadoSistema, LocalTime tiempoExtra, Cliente cliente) {
    
        this.fechaCreacion = fechaCreacion;
        this.tecnico = tecnico;
        this.fechaAsignacion = fechaAsignacion;
        this.consideracion = consideracion;
        this.estado = estado;
        this.descripcionCliente = descripcionCliente;
        this.problema = problema;
        this.servicio = servicio;
        this.complejidadAlta = complejidadAlta;
        this.tiempoUtilizadoTecnico = tiempoUtilizadoTecnico;
        this.tiempoEstimadoSistema = tiempoEstimadoSistema;
        this.tiempoExtra = tiempoExtra;
        this.cliente = cliente;
    }

 



}
