package inutile2;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cConversatie")
public class cConversatie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Conv")
	private Long idConv;

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * @JoinColumn(name = "ID_Conversatie")
	 */// , nullable=false

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Stire_Conversatii", 
	joinColumns = @JoinColumn(name = "Id_Conv"), 
	inverseJoinColumns = @JoinColumn(name = "Id_stire"))
	private Set<cStire> stireConv = new HashSet<cStire>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_angajat")
	private aAngajat angajat;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_client")
	private aClient client;

	@Column(name = "sumar")
	private String sumar;

	@Column(name = "data")
	private Date data;

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

	public Set<cStire> getStireConv() {
		return stireConv;
	}

	public void setStireConv(Set<cStire> stireConv) {
		this.stireConv = stireConv;
	}

	public aAngajat getAngajat() {
		return angajat;
	}

	public void setAngajat(aAngajat angajat) {
		this.angajat = angajat;
	}

	public aClient getClient() {
		return client;
	}

	public void setClient(aClient client) {
		this.client = client;
	}

	public cConversatie(Long idConv, Set<cStire> stireConv, aAngajat angajat,
			aClient client, String sumar, Date data, String discutie) {
		super();
		this.idConv = idConv;
		this.stireConv = stireConv;
		this.angajat = angajat;
		this.client = client;
		this.sumar = sumar;
		this.data = data;
		this.discutie = discutie;
	}

	public cConversatie(Set<cStire> stireConv, aAngajat angajat,
			aClient client, String sumar, Date data, String discutie) {
		super();
		this.stireConv = stireConv;
		this.angajat = angajat;
		this.client = client;
		this.sumar = sumar;
		this.data = data;
		this.discutie = discutie;
	}

	public cConversatie() {
		super();

	}

}
