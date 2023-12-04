package example.hibernate.pyme.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name="clientes")
@Setter @Getter @NoArgsConstructor
public class Cliente implements Serializable {
 
 	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8438118305668394283L;

 
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name="razon_social",length=250,nullable=false)
    private String razonSocial;

    @Column(name="CUIT",nullable=false)
    private int cuit;

    @Column(name="eMail",length=150,nullable=false)
    private String Email;


    
    public Cliente(String razonSocial, int cuit, String eMail) {
        this.setRazonSocial(razonSocial);
        this.setCuit(cuit);
        this.setEmail(eMail);
    };
     

	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((razonSocial == null) ? 0 : razonSocial.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;   
        if (getClass() != obj.getClass())
            return false;
        final Cliente other = (Cliente) obj;
        if (razonSocial == null) {
            if (other.razonSocial != null)
                return false;
        } else if (!razonSocial.equals(other.razonSocial))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return 
          "\n                       Cliente"
        + "\n                       -------" 
        +"\n                       id = " + id 
        + ",\n                       Razon Social = " + razonSocial 
        + ",\n                       CUIT = " + cuit 
        + ",\n                       eMail = " + Email +"\n";
    }

    



}
