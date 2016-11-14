package inutile2;

import javax.persistence.*;

@Entity
@Table(name = "aUser")
public class aUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_usr")
	private Long idUsr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_angajat")
	//, referencedColumnName = " idAng"
	private aAngajat angajat;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_pass")
	private String userPass;

	@Column(name = "user_tip")
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

	public aAngajat getAngajat() {
		return angajat;
	}

	public void setAngajat(aAngajat angajat) {
		this.angajat = angajat;
	}

	public aUser(String userName, String userPass, String userTip) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userTip = userTip;
	}

	public aUser() {
		super();
	}

}
