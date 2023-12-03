package example.hibernate.pyme.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SECTOR")
@Setter @Getter @NoArgsConstructor
public class Sector implements Serializable {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy="sector")
	private List<Empleado> empleados;
	
}