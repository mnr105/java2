package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import Model.Adresa;

@MappedSuperclass
public class Persoana {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSOANA")
	private Long idPersoana;

	@Column(name = "NUME_PRENUME")
	private String numePrenume;

	@Column(name = "	DATA_NASTERE")
	private Date dataNastere;

	@Column(name = "EDUCATIE_ABSOLVITA")
	private String educatieAbsolvita;

	@Column(name = "EXP_ANTERIOARA_JOB")
	private String experientaAnterioaraJob;

	@Column(name = "EXP_TRANZACT")
	private String experientaTranzactionare;

	@Column(name = "MAIL_PERS")
	private String mailPersonal;

	@Embedded
	public Adresa adrss = new Adresa();

	public Adresa getAdrss() {
		return adrss;
	}

	public void setAdrss(Adresa adrss) {
		this.adrss = adrss;
	}

	public String getNumePrenume() {
		return numePrenume;
	}

	public void setNumePrenume(String numePrenume) {
		this.numePrenume = numePrenume;
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

	public String getExperientaAnterioaraJob() {
		return experientaAnterioaraJob;
	}

	public void setExperientaAnterioaraJob(String experientaAnterioaraJob) {
		this.experientaAnterioaraJob = experientaAnterioaraJob;
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

	public Long getIdPersoana() {
		return idPersoana;
	}

	public void setIdAng(Long idPersoana) {
		this.idPersoana = idPersoana;
	}

	public void setIdPersoana(Long idPersoana) {
		this.idPersoana = idPersoana;
	}

	public String AfiseazaCons() {
		return "Persoana: " + this.getNumePrenume() + " cu id-ul: ";
	}

	public Persoana(Long idPersoana, String numePrenume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioaraJob,
			String experientaTranzactionare, String mailPersonal, Adresa adrss) {
		super();
		this.idPersoana = idPersoana;
		this.numePrenume = numePrenume;
		this.dataNastere = dataNastere;
		this.educatieAbsolvita = educatieAbsolvita;
		this.experientaAnterioaraJob = experientaAnterioaraJob;
		this.experientaTranzactionare = experientaTranzactionare;
		this.mailPersonal = mailPersonal;
		this.adrss = adrss;
	}

	public Persoana(String numePrenume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioaraJob,
			String experientaTranzactionare, String mailPersonal, Adresa adrss) {
		super();
		this.numePrenume = numePrenume;
		this.dataNastere = dataNastere;
		this.educatieAbsolvita = educatieAbsolvita;
		this.experientaAnterioaraJob = experientaAnterioaraJob;
		this.experientaTranzactionare = experientaTranzactionare;
		this.mailPersonal = mailPersonal;
		this.adrss = adrss;
	}

	public Persoana() {
		super();

	}

}
