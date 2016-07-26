package Model;

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

import Model.Instrument;

@Entity
@Table(name = "Portofoliu")
public class Portofoliu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PORTOFOLIU")
	private Long idPortf;

	@Column(name = "NUME_PORTOFOLIU")
	private String name;

	// @OneToMany(cascade=CascadeType.ALL ,mappedBy = "portofoliu")
	// @Column(name = "Instrumente")

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "INSTRUMENTE_PROTOFOLIU", joinColumns = @JoinColumn(name = "ID_PORTOFOLIU"), inverseJoinColumns = @JoinColumn(name = " ID_INSTRUMENT"))
	private List<Instrument> Instrumente = new ArrayList<>();

	// G+S+C //
	public List<Instrument> getInstrumente() {
		return Instrumente;
	}

	public void setInstrumente(List<Instrument> instrumente) {
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

	@Override
	public String toString() {
		return "Portofoliul cu id " + getIdPortf() + " se numeste " + getName()
				+ " si are urmatoarele instrumente: " + "De facut!!";

	}

	public Portofoliu(Long idPortf, String name, List<Instrument> instrumente) {
		super();
		this.idPortf = idPortf;
		this.name = name;
		Instrumente = instrumente;
	}

	public Portofoliu(String name, List<Instrument> instrumente) {
		super();
		this.name = name;
		Instrumente = instrumente;
	}

	public Portofoliu() {
		super();

	}

}
