package inutile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "aAngajat")
public class aAngajat extends aPersoana {

	public List<String> getTelefAng() {
		return telefAng;
	}

	public void setTelefAng(List<String> telefAng) {
		this.telefAng = telefAng;
	}

	@ElementCollection
	@CollectionTable(name = "Telefon_ang", joinColumns = @JoinColumn(name = "id_pers"))
	@Column(name = "tel_a")
	private List<String> telefAng = new ArrayList<String>();

	@Column(name = "poz_in_compaine")
	private String pozitieInComp;

	@Column(name = "kpi_ang")
	private int KPI;

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

	public aAngajat(Long idAng, String nume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioara,
			String experientaTranzactionare, String mailPersonal,
			aAdresa adrss, List<String> telefAng, String pozitieInComp, int kPI) {
		super(idAng, nume, dataNastere, educatieAbsolvita,
				experientaAnterioara, experientaTranzactionare, mailPersonal,
				adrss);
		this.telefAng = telefAng;
		this.pozitieInComp = pozitieInComp;
		KPI = kPI;
	}

	public aAngajat(String nume, Date dataNastere, String educatieAbsolvita,
			String experientaAnterioara, String experientaTranzactionare,
			String mailPersonal, aAdresa adrss, List<String> telefAng,
			String pozitieInComp, int kPI) {
		super(nume, dataNastere, educatieAbsolvita, experientaAnterioara,
				experientaTranzactionare, mailPersonal, adrss);
		this.telefAng = telefAng;
		this.pozitieInComp = pozitieInComp;
		KPI = kPI;
	}

	public aAngajat() {
		super();
	}

}
