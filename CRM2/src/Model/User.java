package Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import Model.Angajat;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USER")
	private Long idUsr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ANGAJAT")
	// , referencedColumnName = " idAng"
	private Angajat angajat;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_PASS")
	private String userPass;

	@Column(name = "USER_TIP")
	private String userTip;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserTip() {
		return userTip;
	}

	public void setUserTip(String userTip) {
		this.userTip = userTip;
	}

	public Long getIdUsr() {
		return idUsr;
	}

	public void setIdUsr(Long idUsr) {
		this.idUsr = idUsr;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}

	public User(String userName, String userPass, String userTip) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userTip = userTip;
	}

	public User() {
		super();
	}
}
