package inutile2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.engine.spi.CascadingActions;

@Entity
@Table(name = "cPortofoliu")
public class cPortofoliu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_portof")
	private Long idPortf;

	@Column(name = "Nume_portof")
	private String name;

	//@OneToMany(cascade=CascadeType.ALL ,mappedBy = "portofoliu")
	//@Column(name = "Instrumente")
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Instr_Portofoliu",
	joinColumns = @JoinColumn (name="Id_portof"),
	inverseJoinColumns = @JoinColumn(name  =" Id_intrument"))
	private List<bInstrument> Instrumente = new ArrayList<>();

	// G+S+C //
	public List<bInstrument> getInstrumente() {
		return Instrumente;
	}

	public void setInstrumente(List<bInstrument> instrumente) {
		Instrumente = instrumente;
	}

	public Long getIdPortf() {
		return idPortf;
	}

	public void setIdPortf(Long idPortf) {
		this.idPortf = idPortf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public cPortofoliu(Long idPortf, String name, List<bInstrument> instrumente) {
		super();
		this.idPortf = idPortf;
		this.name = name;
		Instrumente = instrumente;
	}

	public cPortofoliu(String name, List<bInstrument> instrumente) {
		super();
		this.name = name;
		Instrumente = instrumente;
	}
	
	public cPortofoliu() {
		super();

	}

	@Override
	public String toString() {
		return "Portofoliul cu id " + getIdPortf() + " se numeste " + getName()
				+ " si are urmatoarele instrumente: " + "De facut!!";

	}
}
