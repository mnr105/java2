package inutile;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "aClient")
public class aClient extends aPersoana {

	@ElementCollection
	@CollectionTable(name = "Telefon_client", joinColumns = @JoinColumn(name = "id_pers"))
	@Column(name = "tel_c")
	private List<String> telefCli = new ArrayList<String>();

	@Column(name = "potential_client")
	private int potential;

	@Column(name = "faza_discutii")
	private String faza;

	@Column(name = "ore_lucru")
	private String oreLucru;

	public List<String> getTelefCli() {
		return telefCli;
	}

	public void setTelefCli(List<String> telefCli) {
		this.telefCli = telefCli;
	}

	@Column(name = "caracter_client")
	private String caracter;

	public List<String> getTelefoane() {
		return telefCli;
	}

	public void setTelefoane(List<String> telefoane) {
		this.telefCli = telefoane;
	}

	@Column(name = "link_util")
	private String linkClient;
	@Column(name = "contactat_de")
	private String contactatDe;
	@Column(name = "creare_client")
	private Date creare;
	@Column(name = "update_client")
	private Date lastUpdate;
	@Column(name = "update_by")
	private String lastUpdateBy;
	@Column(name = "functite_actuala")
	private String functieActuala;

	/*
	 * public Long getIdClient() { return idClient; }
	 * 
	 * public void setIdClient(Long idClient) { this.idClient = idClient; }
	 */

	private String creatDe;

	public Date getCreare() {
		return creare;
	}

	public void setCreare(Date creare) {
		this.creare = creare;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public String getCreatDe() {
		return creatDe;
	}

	public void setCreatDe(String creatDe) {
		this.creatDe = creatDe;
	}

	public int getPotential() {
		return potential;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}

	public String getFaza() {
		return faza;
	}

	public void setFaza(String faza) {
		this.faza = faza;
	}

	public String getOreLucru() {
		return oreLucru;
	}

	public void setOreLucru(String oreLucru) {
		this.oreLucru = oreLucru;
	}

	public String getCaracter() {
		return caracter;
	}

	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}

	public String getLinkClient() {
		return linkClient;
	}

	public void setLinkClient(String linkClient) {
		this.linkClient = linkClient;
	}

	public String getContactatDe() {
		return contactatDe;
	}

	public void setContactatDe(String contactatDe) {
		this.contactatDe = contactatDe;
	}

	public String getFunctieActuala() {
		return functieActuala;
	}

	public void setFunctieActuala(String functieActuala) {
		this.functieActuala = functieActuala;
	}


	public aClient(Long idAng, String nume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioara,
			String experientaTranzactionare, String mailPersonal,
			aAdresa adrss, List<String> telefCli, int potential, String faza,
			String oreLucru, String caracter, String linkClient,
			String contactatDe, Date creare, Date lastUpdate,
			String lastUpdateBy, String functieActuala, String creatDe) {
		super(idAng, nume, dataNastere, educatieAbsolvita,
				experientaAnterioara, experientaTranzactionare, mailPersonal,
				adrss);
		this.telefCli = telefCli;
		this.potential = potential;
		this.faza = faza;
		this.oreLucru = oreLucru;
		this.caracter = caracter;
		this.linkClient = linkClient;
		this.contactatDe = contactatDe;
		this.creare = creare;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.functieActuala = functieActuala;
		this.creatDe = creatDe;
	}

	public aClient(String nume, Date dataNastere, String educatieAbsolvita,
			String experientaAnterioara, String experientaTranzactionare,
			String mailPersonal, aAdresa adrss, List<String> telefCli,
			int potential, String faza, String oreLucru, String caracter,
			String linkClient, String contactatDe, Date creare,
			Date lastUpdate, String lastUpdateBy, String functieActuala,
			String creatDe) {
		super(nume, dataNastere, educatieAbsolvita, experientaAnterioara,
				experientaTranzactionare, mailPersonal, adrss);
		this.telefCli = telefCli;
		this.potential = potential;
		this.faza = faza;
		this.oreLucru = oreLucru;
		this.caracter = caracter;
		this.linkClient = linkClient;
		this.contactatDe = contactatDe;
		this.creare = creare;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.functieActuala = functieActuala;
		this.creatDe = creatDe;
	}

	public aClient() {
		super();

	}

}
