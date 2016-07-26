package inutile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aUser")
public class aUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_usr")
	private Long idUsr;
	
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

	public aUser(String userName, String userPass, String userTip) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.userTip = userTip;
	}
	
	
}
