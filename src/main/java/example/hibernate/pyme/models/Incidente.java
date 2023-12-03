package example.hibernate.pyme.models;
import java.beans.Transient;
import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="incidente")
@Getter @Setter @NoArgsConstructor
public class Incidente implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int incidenteID;

    @Column(name="fechaCreacion",nullable=false)
    private Date fechaCreacion;

    @OneToOne
    @JoinColumn(name="tecnico_id", referencedColumnName="id")
    private Tecnico tecnico;

    @Column(name="fechaAsignacion",nullable=false)
    private Date fechaAsignacion;

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

    @Column(name="complejidadAlta",nullable=false)
    private boolean complejidadAlta;

    @Column(name="tiempoUtilizadoTecnico",nullable=false)
    private double tiempoUtilizadoTecnico;

    @Column(name="tiempoEstimadoSistema",nullable=false)
    private double tiempoEstimadoSistema;

    @Column(name="tiempoExtra",nullable=false)
    private Time tiempoExtra;

    @ManyToOne //un cliente puede tener muchos incidentes
    @JoinColumn(name="cliente_id", referencedColumnName="id")
    private Cliente cliente;

    public Incidente(Date fechaCreacion, Tecnico tecnico, Date fechaAsignacion, String consideracion,
                     String estado, String descripcionCliente, Problema problema, Servicio servicio, boolean complejidadAlta,
                     double tiempoUtilizadoTecnico, double tiempoEstimadoSistema, Time tiempoExtra, Cliente cliente) {
    
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
