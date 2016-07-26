package inutile2;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cStire")
public class cStire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_stire")
	private Long idStire;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "stireConv")
	private Set<cConversatie> conversatie  = new HashSet<cConversatie>();

	@Column(name = "nume")
	private String nume;

	@Column(name = "sursa")
	private String sursa;
	
	@Column(name = "ceVizeaza")
	private String ceVizeaza;

	@Column(name = "data_Aparitie")
	private Date dataAparitie;

	@Column(name = "grad_Imp")
	private int gradImp;
	
	public Long getIdStire() {
		return idStire;
	}

	public void setIdStire(Long idStire) {
		this.idStire = idStire;
	}

	public Set<cConversatie> getConversatie() {
		return conversatie;
	}

	public void setConversatie(Set<cConversatie> conversatie) {
		this.conversatie = conversatie;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getSursa() {
		return sursa;
	}

	public void setSursa(String sursa) {
		this.sursa = sursa;
	}

	public String getCeVizeaza() {
		return ceVizeaza;
	}

	public void setCeVizeaza(String ceVizeaza) {
		this.ceVizeaza = ceVizeaza;
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

	public cStire(Long idStire, String nume, String sursa, String ceVizeaza,
			Date dataAparitie, int gradImp) {
		super();
		this.idStire = idStire;
		this.nume = nume;
		this.sursa = sursa;
		this.ceVizeaza = ceVizeaza;
		this.dataAparitie = dataAparitie;
		this.gradImp = gradImp;
	}

	public cStire() {
		super();

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
}
