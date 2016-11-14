package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CONVERSATII")
public class Conversatie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONVERSATIE")
	private Long idConv;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STIRE_CONVERSATII", joinColumns = @JoinColumn(name = "ID_CONVERSATIE"), inverseJoinColumns = @JoinColumn(name = "ID_STIRE"))
	private Set<Stire> stireConv = new HashSet<Stire>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ANG")
	private Angajat angajat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CLNT")
	private Client client;

	@Column(name = "SUMAR")
	private String sumar;

	@Column(name = "DATA_CONV")
	private Date dataConversatie;

	@Column(name = "discutie")
	private String discutie;

	public Long getId() {
		return idConv;
	}

	public void setIdConv(Long idConv) {
		this.idConv = idConv;
	}

	public String getNume() {
		return sumar;
	}

	public void setNume(String sumar) {
		this.sumar = sumar;
	}

	public Date getDataConversatie() {
		return dataConversatie;
	}

	public void setDataConversatie(Date dataConversatie) {
		this.dataConversatie = dataConversatie;
	}

	public String getDiscutie() {
		return discutie;
	}

	public void setDiscutie(String discutie) {
		this.discutie = discutie;
	}

	public String getSumar() {
		return sumar;
	}

	public void setSumar(String sumar) {
		this.sumar = sumar;
	}

	public Set<Stire> getStireConv() {
		return stireConv;
	}

	public void setStireConv(Set<Stire> stireConv) {
		this.stireConv = stireConv;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Conversatie(Long idConv, Set<Stire> stireConv, Angajat angajat,
			Client client, String sumar, Date dataConversatie, String discutie) {
		super();
		this.idConv = idConv;
		this.stireConv = stireConv;
		this.angajat = angajat;
		this.client = client;
		this.sumar = sumar;
		this.dataConversatie = dataConversatie;
		this.discutie = discutie;
	}

	public Conversatie(Set<Stire> stireConv, Angajat angajat, Client client,
			String sumar, Date dataConversatie, String discutie) {
		super();
		this.stireConv = stireConv;
		this.angajat = angajat;
		this.client = client;
		this.sumar = sumar;
		this.dataConversatie = dataConversatie;
		this.discutie = discutie;
	}

	public Conversatie() {
		super();

	}

}
