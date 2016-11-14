package inutile2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bIndice")
public class bIndice extends bInstrument {

	@Column(name = "piata_Tranz")
	private String piataTranz;

	public String getPiataTranz() {
		return piataTranz;
	}

	public void setPiataTranz(String piataTranz) {
		this.piataTranz = piataTranz;
	}



}
