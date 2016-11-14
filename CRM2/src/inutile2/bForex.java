package inutile2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bForex")
public class bForex extends bInstrument {

	@Column(name = "simbolParitate")
	private String simbolParitate;

	public String getSimbolParitate() {
		return simbolParitate;
	}

	public void setSimbolParitate(String simbolParitate) {
		this.simbolParitate = simbolParitate;
	}


}
