package inutile;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "cStire")
public class cStire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_stire")
	private Long id;
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

	public String getCeVizeaza() {
		return ceVizeaza;
	}

	public void setCeVizeaza(String ceVizeaza) {
		this.ceVizeaza = ceVizeaza;
	}

	public String getSursa() {
		return sursa;
	}

	public void setSursa(String sursa) {
		this.sursa = sursa;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public cStire(Long id, String nume, String sursa, String ceVizeaza,
			Date dataAparitie, int gradImp) {
		super();
		this.id = id;
		this.nume = nume;
		this.sursa = sursa;
		this.ceVizeaza = ceVizeaza;
		this.dataAparitie = dataAparitie;
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
}
