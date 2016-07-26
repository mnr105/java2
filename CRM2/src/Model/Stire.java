package Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import Model.Conversatie;

@Entity
@Table(name = "STIRE")
public class Stire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STIRE")
	private Long idStire;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "stireConv")
	private Set<Conversatie> conversatie = new HashSet<Conversatie>();

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STIRE_INTRUMET", joinColumns = @JoinColumn(name = "ID_STIRE"), inverseJoinColumns = @JoinColumn(name = "ID_INSTRUMENT"))
	private Set<Instrument> stireInstrumet = new HashSet<Instrument>();

	@Column(name = "SURSA")
	private String sursa;

	@Column(name = "	SUMAR")
	private String sumar;

	@Column(name = "CE_TARA")
	// Ca sa gasesti compania
	private Tara ceTara;

	@Column(name = "CE_SIMBOL")
	// ca sa gasesti instrumentul
	private String ceSimbol;

	@Column(name = "CE_SECTOR")
	// ca sa gasesti grup de instrumente
	private SectorInstr ceSector;

	@Column(name = "DATA_APARITIE")
	private Date dataAparitie;

	@Column(name = "GRAD")
	private int gradImp;

	public Set<Instrument> getStireInstrumet() {
		return stireInstrumet;
	}

	public void setStireInstrumet(Set<Instrument> stireInstrumet) {
		this.stireInstrumet = stireInstrumet;
	}

	public Long getIdStire() {
		return idStire;
	}

	public void setIdStire(Long idStire) {
		this.idStire = idStire;
	}

	public String getSumar() {
		return sumar;
	}

	public void setSumar(String sumar) {
		this.sumar = sumar;
	}

	public Set<Conversatie> getConversatie() {
		return conversatie;
	}

	public void setConversatie(Set<Conversatie> conversatie) {
		this.conversatie = conversatie;
	}

	public String getSursa() {
		return sursa;
	}

	public void setSursa(String sursa) {
		this.sursa = sursa;
	}

	public Tara getCeTara() {
		return ceTara;
	}

	public void setCeTara(Tara ceTara) {
		this.ceTara = ceTara;
	}

	public Date getDataAparitie() {
		return dataAparitie;
	}

	public void setDataAparitie(Date dataAparitie) {
		this.dataAparitie = dataAparitie;
	}

	public int getGradImp() {
		return gradImp;
	}

	public void setGradImp(int gradImp) {
		this.gradImp = gradImp;
	}

	public String sursa(String x) {
		System.out.println();
		return "Aceasta strire vine de la sursa: " + x;
	}

	public void valabilitate(int gradImp) {
		if (gradImp <= 3)
			System.out
					.println("Pentru a inregistra profit se au la dispozitie mai putin de "
							+ gradImp + " zile!!");
		else
			System.out
					.println("Pentru a inregistra profit se au la dispozitie peste "
							+ gradImp + " zile!!");
	}

	public String getCeSimbol() {
		return ceSimbol;
	}

	public void setCeSimbol(String ceSimbol) {
		this.ceSimbol = ceSimbol;
	}

	public SectorInstr getCeSector() {
		return ceSector;
	}

	public void setCeSector(SectorInstr ceSector) {
		this.ceSector = ceSector;
	}

	public Stire(Set<Conversatie> conversatie, String sursa, String sumar,
			Tara ceTara, String ceSimbol, SectorInstr ceSector,
			Date dataAparitie, int gradImp) {
		super();
		this.conversatie = conversatie;
		this.sursa = sursa;
		this.sumar = sumar;
		this.ceTara = ceTara;
		this.ceSimbol = ceSimbol;
		this.ceSector = ceSector;
		this.dataAparitie = dataAparitie;
		this.gradImp = gradImp;
	}

	public Stire(Long idStire, Set<Conversatie> conversatie, String sursa,
			String sumar, Tara ceTara, String ceSimbol, SectorInstr ceSector,
			Date dataAparitie, int gradImp) {
		super();
		this.idStire = idStire;
		this.conversatie = conversatie;
		this.sursa = sursa;
		this.sumar = sumar;
		this.ceTara = ceTara;
		this.ceSimbol = ceSimbol;
		this.ceSector = ceSector;
		this.dataAparitie = dataAparitie;
		this.gradImp = gradImp;
	}

	public Stire() {
		super();

	}

}
