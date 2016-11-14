package inutile;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "cConversatie")
public class cConversatie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_disc")
	private Long id;
	@Column(name = "sumar")
	private String sumar;
	@Column(name = "Id_Ang_disct")
	private int IdAngajat;
	@Column(name = "Id_Clnt_disc")
	private int IdClient;
	@Column(name = "data")
	private Date data;
	@Column(name = "discutie")
	private String discutie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNume() {
		return sumar;
	}

	public void setNume(String sumar) {
		this.sumar = sumar;
	}

	public int getIdAngajat() {
		return IdAngajat;
	}

	public void setIdAngajat(int idAngajat) {
		IdAngajat = idAngajat;
	}

	public int getIdClient() {
		return IdClient;
	}

	public void setIdClient(int idClient) {
		IdClient = idClient;
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

	public cConversatie(Long id, String sumar, int idAngajat, int idClient,
			Date data, String discutie) {
		super();
		this.id = id;
		this.sumar = sumar;
		IdAngajat = idAngajat;
		IdClient = idClient;
		this.data = data;
		this.discutie = discutie;
	}

}
