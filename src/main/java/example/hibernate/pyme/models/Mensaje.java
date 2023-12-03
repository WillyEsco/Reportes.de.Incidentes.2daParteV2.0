
package example.hibernate.pyme.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="mensaje")
@Getter @Setter @NoArgsConstructor
public class Mensaje implements Serializable {
    
    @Id
    @Column(name="id") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String titulo;
    
    @Column(name="descripcion_mensaje",length=150,nullable=false)
    private String cuerpo;
            
    @Column(name="hora_envio", length=10,nullable=false)       
    private LocalDateTime horaEnvio;
    
    @Column(name="recibido", length=10,nullable=false)
    private Boolean recebido;
    
    @OneToOne
    @JoinColumn(name="mensaje_id", referencedColumnName="id")
    private Tecnico tecnico;

    public Mensaje(String titulo, String cuerpo, LocalDateTime horaEnvio, Boolean recebido, Tecnico tecnico) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.horaEnvio = horaEnvio;
        this.recebido = recebido;
        this.tecnico = tecnico;
    }
    

    @Override
    public String toString() {
        return "Mensaje{" + "titulo=" + titulo + ", cuerpo=" + cuerpo + ", horaEnvio=" + horaEnvio + ", recebido=" + recebido + ", tecnico=" + tecnico + '}';
    }
    
    
}
