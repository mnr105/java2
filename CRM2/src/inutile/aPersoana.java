package inutile;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class aPersoana {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pers")
	private Long idAng;

	@Column(name = "nume_pers")
	private String nume;

	@Column(name = "data_nastere")
	private Date dataNastere;

	@Column(name = "educatie_abs")
	private String educatieAbsolvita;

	@Column(name = "experienta_anterioara")
	private String experientaAnterioara; // se poate sa fie nevoie de alt tip
											// dedata
	@Column(name = "experienta_tranz")
	private String experientaTranzactionare;

	@Column(name = "mail_pers")
	private String mailPersonal;

	@Embedded
	public aAdresa adrss = new aAdresa();

	public aAdresa getAdrss() {
		return adrss;
	}

	public void setAdrss(aAdresa adrss) {
		this.adrss = adrss;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Date getDataNastere() {
		return dataNastere;
	}

	public void setDataNastere(Date dataNastere) {
		this.dataNastere = dataNastere;
	}

	public String getEducatieAbsolvita() {
		return educatieAbsolvita;
	}

	public void setEducatieAbsolvita(String educatieAbsolvita) {
		this.educatieAbsolvita = educatieAbsolvita;
	}

	public String getExperientaAnterioara() {
		return experientaAnterioara;
	}

	public void setExperientaAnterioara(String experientaAnterioara) {
		this.experientaAnterioara = experientaAnterioara;
	}

	public String getExperientaTranzactionare() {
		return experientaTranzactionare;
	}

	public void setExperientaTranzactionare(String experientaTranzactionare) {
		this.experientaTranzactionare = experientaTranzactionare;
	}

	public String getMailPersonal() {
		return mailPersonal;
	}

	public void setMailPersonal(String mailPersonal) {
		this.mailPersonal = mailPersonal;
	}

	public Long getIdAng() {
		return idAng;
	}

	public void setIdAng(Long idAng) {
		this.idAng = idAng;
	}

	public aPersoana(Long idAng, String nume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioara,
			String experientaTranzactionare, String mailPersonal, aAdresa adrss) {
		super();
		this.idAng = idAng;
		this.nume = nume;
		this.dataNastere = dataNastere;
		this.educatieAbsolvita = educatieAbsolvita;
		this.experientaAnterioara = experientaAnterioara;
		this.experientaTranzactionare = experientaTranzactionare;
		this.mailPersonal = mailPersonal;
		this.adrss = adrss;
	}

	public aPersoana(String nume, Date dataNastere, String educatieAbsolvita,
			String experientaAnterioara, String experientaTranzactionare,
			String mailPersonal, aAdresa adrss) {
		super();

		this.nume = nume;
		this.dataNastere = dataNastere;
		this.educatieAbsolvita = educatieAbsolvita;
		this.experientaAnterioara = experientaAnterioara;
		this.experientaTranzactionare = experientaTranzactionare;
		this.mailPersonal = mailPersonal;
		this.adrss = adrss;
	}

	public aPersoana() {
		super();
	}

	public String AfiseazaCons() {
		return "aPersoana: " + this.getNume() + " cu id-ul: ";
	}

}
