package inutile2;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bActiune")
public class bActiune extends bInstrument {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_comp")
	private cCompania companie;

	public cCompania getCompanie() {
		return companie;
	}

	public void setCompanie(cCompania companie) {
		this.companie = companie;
	}

	public bActiune(String tipInstument, String unitateMasura,
			TipContract tipC, double pretAchizitie, double pretSpot,
			String emitent, int nrObjDetinutedeFond, boolean buyOrSell,
			Date maturitate, int cantitatea, double pips, double prima,
			String stragetie, cCompania companie) {
		super(tipInstument, unitateMasura, tipC, pretAchizitie, pretSpot,
				emitent, nrObjDetinutedeFond, buyOrSell, maturitate,
				cantitatea, pips, prima, stragetie);
		this.companie = companie;
	}

	public bActiune() {
		super();

	}

	/*
	 * public bActiune(Long idInstr, cPortofoliu portofoliu, String
	 * tipInstument, String unitateMasura, TipContract tipC, double
	 * pretAchizitie, double pretSpot, String emitent, int nrObjDetinutedeFond,
	 * boolean buyOrSell, Date maturitate, int cantitatea, double pips, double
	 * prima, String stragetie, cCompania companie) { super(idInstr, portofoliu,
	 * tipInstument, unitateMasura, tipC, pretAchizitie, pretSpot, emitent,
	 * nrObjDetinutedeFond, buyOrSell, maturitate, cantitatea, pips, prima,
	 * stragetie); this.companie = companie; }
	 * 
	 * public bActiune(cPortofoliu portofoliu, String tipInstument, String
	 * unitateMasura, TipContract tipC, double pretAchizitie, double pretSpot,
	 * String emitent, int nrObjDetinutedeFond, boolean buyOrSell, Date
	 * maturitate, int cantitatea, double pips, double prima, String stragetie,
	 * cCompania companie) { super(portofoliu, tipInstument, unitateMasura,
	 * tipC, pretAchizitie, pretSpot, emitent, nrObjDetinutedeFond, buyOrSell,
	 * maturitate, cantitatea, pips, prima, stragetie); this.companie =
	 * companie; }
	 */

}
