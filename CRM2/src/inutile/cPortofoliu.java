package inutile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cPortofoliu")
public class cPortofoliu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_portof")
	private Long idPortf;

	@Column(name = "Nume_portof")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Actiuni")
	private List<bActiune> Actiuni = new ArrayList<bActiune>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Drepturi")
	private List<bDrept> Drepturi = new ArrayList<bDrept>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Forex")
	private List<bForex> bForex = new ArrayList<bForex>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Garantii")
	private List<bGarantie> Garantie = new ArrayList<bGarantie>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Indici")
	private List<bIndice> Indici = new ArrayList<bIndice>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Marfuri")
	private List<bMarfuri> Marfuri = new ArrayList<bMarfuri>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "portofoliu")
	@Column(name = "Obligatiune")
	private List<bObligatiune> Obligatiune = new ArrayList<bObligatiune>();

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

	public cPortofoliu() {
		super();

	}

	@Override
	public String toString() {
		return "Portofoliul cu id " + getIdPortf() + " se numeste " + getName()
				+ " si are urmatoarele instrumente: " + "De facut!!";

	}

	public cPortofoliu(String name, List<bActiune> actiuni,
			List<bDrept> drepturi, List<inutile.bForex> bForex,
			List<bGarantie> garantie, List<bIndice> indici,
			List<bMarfuri> marfuri, List<bObligatiune> obligatiune) {
		super();
		this.name = name;
		Actiuni = actiuni;
		Drepturi = drepturi;
		this.bForex = bForex;
		Garantie = garantie;
		Indici = indici;
		Marfuri = marfuri;
		Obligatiune = obligatiune;
	}

	public cPortofoliu(Long idPortf, String name, List<bActiune> actiuni,
			List<bDrept> drepturi, List<inutile.bForex> bForex,
			List<bGarantie> garantie, List<bIndice> indici,
			List<bMarfuri> marfuri, List<bObligatiune> obligatiune) {
		super();
		this.idPortf = idPortf;
		this.name = name;
		Actiuni = actiuni;
		Drepturi = drepturi;
		this.bForex = bForex;
		Garantie = garantie;
		Indici = indici;
		Marfuri = marfuri;
		Obligatiune = obligatiune;
	}

	public List<bActiune> getActiuni() {
		return Actiuni;
	}

	public void setActiuni(List<bActiune> actiuni) {
		Actiuni = actiuni;
	}

	public List<bDrept> getDrepturi() {
		return Drepturi;
	}

	public void setDrepturi(List<bDrept> drepturi) {
		Drepturi = drepturi;
	}

	public List<bForex> getbForex() {
		return bForex;
	}

	public void setbForex(List<bForex> bForex) {
		this.bForex = bForex;
	}

	public List<bGarantie> getGarantie() {
		return Garantie;
	}

	public void setGarantie(List<bGarantie> garantie) {
		Garantie = garantie;
	}

	public List<bIndice> getIndici() {
		return Indici;
	}

	public void setIndici(List<bIndice> indici) {
		Indici = indici;
	}

	public List<bMarfuri> getMarfuri() {
		return Marfuri;
	}

	public void setMarfuri(List<bMarfuri> marfuri) {
		Marfuri = marfuri;
	}

	public List<bObligatiune> getObligatiune() {
		return Obligatiune;
	}

	public void setObligatiune(List<bObligatiune> obligatiune) {
		Obligatiune = obligatiune;
	}
}
