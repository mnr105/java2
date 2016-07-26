package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import Model.Adresa;

@Entity
@Table(name = "ANGAJATI")
public class Angajat extends Persoana {

	@ElementCollection
	@CollectionTable(name = "TEL_ANGAJAT",
	joinColumns = @JoinColumn(name = "ID_PERSOANA"))
	@Column(name = "TEL_ANG")
	private List<String> telefAng = new ArrayList<String>();

	@Column(name = "POZ_IN_COMPANIE")
	private String pozitieInComp;

	@Column(name = "KPI_ANGAJAT")
	private int KPI;

	/*
	 * daca o vrem bidirect:
	 * 
	 * @OneToOne(mappedBy = "angajat") private aUser user;
	 */

	public String getPozitieInComp() {
		return pozitieInComp;
	}

	public void setPozitieInComp(String pozitieInComp) {
		this.pozitieInComp = pozitieInComp;
	}

	public int getKPI() {
		return KPI;
	}

	public void setKPI(int kPI) {
		this.KPI = kPI;
	}

	public List<String> getTelefoane() {
		return telefAng;
	}

	public void setTelefoane(List<String> telefAng) {
		this.telefAng = telefAng;
	}

	public List<String> getTelefAng() {
		return telefAng;
	}

	public void setTelefAng(List<String> telefAng) {
		this.telefAng = telefAng;
	}

	public Angajat(Long idPersoana, String numePrenume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioaraJob,
			String experientaTranzactionare, String mailPersonal, Adresa adrss,
			List<String> telefAng, String pozitieInComp, int kPI) {
		super(idPersoana, numePrenume, dataNastere, educatieAbsolvita,
				experientaAnterioaraJob, experientaTranzactionare,
				mailPersonal, adrss);
		this.telefAng = telefAng;
		this.pozitieInComp = pozitieInComp;
		KPI = kPI;
	}


	public Angajat(String numePrenume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioaraJob,
			String experientaTranzactionare, String mailPersonal, Adresa adrss,
			List<String> telefAng, String pozitieInComp, int kPI) {
		super(numePrenume, dataNastere, educatieAbsolvita,
				experientaAnterioaraJob, experientaTranzactionare,
				mailPersonal, adrss);
		this.telefAng = telefAng;
		this.pozitieInComp = pozitieInComp;
		KPI = kPI;
	}

	public Angajat() {
		super();

	}

}
