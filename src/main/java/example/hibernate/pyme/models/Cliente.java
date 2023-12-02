package example.hibernate.pyme.models;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class Cliente implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name="razon_social",length=250,nullable=false)
    private String razonSocial;

    @Column(name="CUIT",nullable=false)
    private int cuit;
    @Column(name="eMail",length=150,nullable=false)
    private String eMail;

}
