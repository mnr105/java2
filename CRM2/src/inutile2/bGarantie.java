package inutile2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bGarantie")
public class bGarantie extends bInstrument {

	@Column(name = "nune_Intrs")
	private String nuneIntrs;

	@Column(name = "de_Cand")
	private Date deCand;

	@Column(name = "pana_Cand")
	private Date panaCand;

	public String getNuneIntrs() {
		return nuneIntrs;
	}

	public void setNuneIntrs(String nuneIntrs) {
		this.nuneIntrs = nuneIntrs;
	}

	public Date getDeCand() {
		return deCand;
	}

	public void setDeCand(Date deCand) {
		this.deCand = deCand;
	}

	public Date getPanaCand() {
		return panaCand;
	}

	public void setPanaCand(Date panaCand) {
		this.panaCand = panaCand;
	}


}
