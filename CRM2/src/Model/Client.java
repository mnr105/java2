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
@Table(name = "CLIENTI")
public class Client extends Persoana {

	@ElementCollection
	@CollectionTable(name = "TEL_CLIENT", 
	joinColumns = @JoinColumn(name = "ID_PERSOANA"))
	@Column(name = "TEL_CLNT")
	private List<String> telefCli = new ArrayList<String>();

	@Column(name = "POTENTIAL_CLIENT")
	private int potentialulClientului;

	@Column(name = "FAZA_DISC")
	private String faza;

	@Column(name = "ORE_DE_LUCRU")
	private String oreLucru;

	@Column(name = "CARACTER_CLIENT")
	private String caracter;

	@Column(name = "LINKURI_UTILE")
	private String linkClient;

	@Column(name = "DATA_CREARE_CLIENT")
	private Date creare;

	@Column(name = "DATA_LAST_UPDATE")
	private Date lastUpdate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdateBy;

	@Column(name = "JOB_ACTUAL")
	private String functieActuala;

	private String creatDe;

	public List<String> getTelefCli() {
		return telefCli;
	}

	public void setTelefCli(List<String> telefCli) {
		this.telefCli = telefCli;
	}

	public List<String> getTelefoane() {
		return telefCli;
	}

	public void setTelefoane(List<String> telefoane) {
		this.telefCli = telefoane;
	}

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

	public int getPotentialulClientului() {
		return potentialulClientului;
	}

	public void setPotentialulClientului(int potentialulClientului) {
		this.potentialulClientului = potentialulClientului;
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

	public String getFunctieActuala() {
		return functieActuala;
	}

	public void setFunctieActuala(String functieActuala) {
		this.functieActuala = functieActuala;
	}

	public Client(Long idPersoana, String numePrenume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioaraJob,
			String experientaTranzactionare, String mailPersonal, Adresa adrss,
			List<String> telefCli, int potentialulClientului, String faza,
			String oreLucru, String caracter, String linkClient, Date creare,
			Date lastUpdate, String lastUpdateBy, String functieActuala,
			String creatDe) {
		super(idPersoana, numePrenume, dataNastere, educatieAbsolvita,
				experientaAnterioaraJob, experientaTranzactionare,
				mailPersonal, adrss);
		this.telefCli = telefCli;
		this.potentialulClientului = potentialulClientului;
		this.faza = faza;
		this.oreLucru = oreLucru;
		this.caracter = caracter;
		this.linkClient = linkClient;
		this.creare = creare;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.functieActuala = functieActuala;
		this.creatDe = creatDe;
	}

	public Client(String numePrenume, Date dataNastere,
			String educatieAbsolvita, String experientaAnterioaraJob,
			String experientaTranzactionare, String mailPersonal, Adresa adrss,
			List<String> telefCli, int potentialulClientului, String faza,
			String oreLucru, String caracter, String linkClient, Date creare,
			Date lastUpdate, String lastUpdateBy, String functieActuala,
			String creatDe) {
		super(numePrenume, dataNastere, educatieAbsolvita,
				experientaAnterioaraJob, experientaTranzactionare,
				mailPersonal, adrss);
		this.telefCli = telefCli;
		this.potentialulClientului = potentialulClientului;
		this.faza = faza;
		this.oreLucru = oreLucru;
		this.caracter = caracter;
		this.linkClient = linkClient;
		this.creare = creare;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.functieActuala = functieActuala;
		this.creatDe = creatDe;
	}

	public Client() {
		super();

	}

}
