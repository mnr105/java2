package inutile2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bObligatiune")
public class bObligatiune extends bInstrument {

	@Column(name = "rata_Nominala_Anuala")
	private float rataNominalaAnuala;

	@Column(name = "convertibilitate")
	private boolean convertibilitate;

	public float getRataNominalaAnuala() {
		return rataNominalaAnuala;
	}

	public void setRataNominalaAnuala(float rataNominalaAnuala) {
		this.rataNominalaAnuala = rataNominalaAnuala;
	}

	public boolean isConvertibilitate() {
		return convertibilitate;
	}

	public void setConvertibilitate(boolean convertibilitate) {
		this.convertibilitate = convertibilitate;
	}


}
