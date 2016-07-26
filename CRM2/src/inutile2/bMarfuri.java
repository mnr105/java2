package inutile2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bMarfuri")
public class bMarfuri extends bInstrument {

	@Column(name = "cantitate_Totala_InPiata")
	private float cantitateTotalaInPiata;

	public float getCantitateTotalaInPiata() {
		return cantitateTotalaInPiata;
	}

	public void setCantitateTotalaInPiata(float cantitateTotalaInPiata) {
		this.cantitateTotalaInPiata = cantitateTotalaInPiata;
	}

}
