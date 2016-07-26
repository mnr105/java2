package inutile2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bDrept")
public class bDrept extends bInstrument {

	@Column(name = "drept_Actiune")
	private String dreptActiune;

	@Column(name = "nrActiuniNouEmise")
	private int nrActiuniNouEmise;

	public String getDreptActiune() {
		return dreptActiune;
	}

	public void setDreptActiune(String dreptActiune) {
		this.dreptActiune = dreptActiune;
	}

	public int getNrActiuniNouEmise() {
		return nrActiuniNouEmise;
	}

	public void setNrActiuniNouEmise(int nrActiuniNouEmise) {
		this.nrActiuniNouEmise = nrActiuniNouEmise;
	}

	/*public bDrept(Long idInstr, cPortofoliu portofoliu, String tipInstument,
			String unitateMasura, TipContract tipC, double pretAchizitie,
			double pretSpot, String emitent, int nrObjDetinutedeFond,
			boolean buyOrSell, Date maturitate, int cantitatea, double pips,
			double prima, String stragetie, String dreptActiune,
			int nrActiuniNouEmise) {
		super(idInstr, portofoliu, tipInstument, unitateMasura, tipC,
				pretAchizitie, pretSpot, emitent, nrObjDetinutedeFond,
				buyOrSell, maturitate, cantitatea, pips, prima, stragetie);
		this.dreptActiune = dreptActiune;
		this.nrActiuniNouEmise = nrActiuniNouEmise;
	}

	public bDrept(cPortofoliu portofoliu, String tipInstument,
			String unitateMasura, TipContract tipC, double pretAchizitie,
			double pretSpot, String emitent, int nrObjDetinutedeFond,
			boolean buyOrSell, Date maturitate, int cantitatea, double pips,
			double prima, String stragetie, String dreptActiune,
			int nrActiuniNouEmise) {
		super(portofoliu, tipInstument, unitateMasura, tipC, pretAchizitie,
				pretSpot, emitent, nrObjDetinutedeFond, buyOrSell, maturitate,
				cantitatea, pips, prima, stragetie);
		this.dreptActiune = dreptActiune;
		this.nrActiuniNouEmise = nrActiuniNouEmise;
	}
*/
}
