package Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import Model.Companie;
import Model.TipContract;

@Entity
@Table(name = "INSTRUMENTE")
public class Instrument {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "ID_INSTRUMENT")
	private Long idInstr;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_COMPANIE")
	private Companie companie;

	@Column(name = "TIP_INSTRUMENT")
	private TipInstrument tipInstr;

	@Column(name = "TIP_CONTRACT")
	private TipContract tipContract;

	@Column(name = "NR_TOTAL_DETINUTE")
	private int nrObjDetinutedeFond;

	@Column(name = "CANTITATE_TOTALA_IN_PIATA")
	// PT MARFURI
	private float cantitateTotalaInPiata;

	@Column(name = "UNITATE_MASURA")
	private String unitateMasura;

	@Column(name = "SIMBOL_PARITATE_ETC")
	private String simbolParitate;

	@Column(name = "RATA_NOMINALA_ANUALA")
	// OBLIGATIUNE
	private float rataNominalaAnuala;

	@Column(name = "CONVERTABILITATE")
	// OBLIGATIUNE
	private boolean convertibilitate;

	@Column(name = "PRET_ACHIZITIE")
	private double pretAchizitie;

	@Column(name = "PRET_SPOT")
	private double pretSpot;

	@Column(name = "EMITENT")
	private String emitent;

	@Column(name = "BUY_SELL")
	private boolean buyOrSell;

	@Column(name = "MATURITATE")
	private Date maturitate;

	@Column(name = "CANTITATE")
	// ?
	private int cantitatea;

	@Column(name = "PIPS")
	private double pips;

	@Column(name = "PRIMA_DE_ACHIZITITE")
	private double prima;
	
	public Set<Stire> getStire() {
		return stire;
	}

	public void setStire(Set<Stire> stire) {
		this.stire = stire;
	}

	public void setTipContract(TipContract tipContract) {
		this.tipContract = tipContract;
	}

	@Column(name = "STRATEGIE")
	private String stragetie;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "stireInstrumet")
	private Set<Stire> stire= new HashSet<Stire>();

	public Long getIdInstr() {
		return idInstr;
	}

	public void setIdInstr(Long idInstr) {
		this.idInstr = idInstr;
	}

	public float getCantitateTotalaInPiata() {
		return cantitateTotalaInPiata;
	}

	public void setCantitateTotalaInPiata(float cantitateTotalaInPiata) {
		this.cantitateTotalaInPiata = cantitateTotalaInPiata;
	}

	public String getSimbolParitate() {
		return simbolParitate;
	}

	public void setSimbolParitate(String simbolParitate) {
		this.simbolParitate = simbolParitate;
	}

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

	public String getUnitateMasura() {
		return unitateMasura;
	}

	public Companie getCompanie() {
		return companie;
	}

	public void setCompanie(Companie companie) {
		this.companie = companie;
	}

	public TipInstrument getTipInstr() {
		return tipInstr;
	}

	public void setTipInstr(TipInstrument tipInstr) {
		this.tipInstr = tipInstr;
	}

	public void setUnitateMasura(String unitateMasura) {
		this.unitateMasura = unitateMasura;
	}

	public double getPretAchizitie() {
		return pretAchizitie;
	}

	public void setPretAchizitie(double pretAchizitie) {
		this.pretAchizitie = pretAchizitie;
	}

	public double getPretSpot() {
		return pretSpot;
	}

	public void setPretSpot(double pretSpot) {
		this.pretSpot = pretSpot;
	}

	public String getEmitent() {
		return emitent;
	}

	public void setEmitent(String emitent) {
		this.emitent = emitent;
	}

	public int getNrObjDetinutedeFond() {
		return nrObjDetinutedeFond;
	}

	public void setNrObjDetinutedeFond(int nrObjDetinutedeFond) {
		this.nrObjDetinutedeFond = nrObjDetinutedeFond;
	}

	public boolean isBuyOrSell() {
		return buyOrSell;
	}

	public void setBuyOrSell(boolean buyOrSell) {
		this.buyOrSell = buyOrSell;
	}

	public Date getMaturitate() {
		return maturitate;
	}

	public void setMaturitate(Date maturitate) {
		this.maturitate = maturitate;
	}

	public int getCantitatea() {
		return cantitatea;
	}

	public void setCantitatea(int cantitatea) {
		this.cantitatea = cantitatea;
	}

	public double getPips() {
		return pips;
	}

	public void setPips(double pips) {
		this.pips = pips;
	}

	public double getPrima() {
		return prima;
	}

	public void setPrima(double prima) {
		this.prima = prima;
	}

	public String getStragetie() {
		return stragetie;
	}

	public void setStragetie(String stragetie) {
		this.stragetie = stragetie;
	}

	public TipContract getTipContract() {
		return tipContract;
	}

	public void setTipC(TipContract tipContract) {
		this.tipContract = tipContract;
	}

	public Instrument(Long idInstr, Companie companie, TipInstrument tipInstr,
			TipContract tipContract, int nrObjDetinutedeFond,
			float cantitateTotalaInPiata, String unitateMasura,
			String simbolParitate, float rataNominalaAnuala,
			boolean convertibilitate, double pretAchizitie, double pretSpot,
			String emitent, boolean buyOrSell, Date maturitate, int cantitatea,
			double pips, double prima, String stragetie) {
		super();
		this.idInstr = idInstr;
		this.companie = companie;
		this.tipInstr = tipInstr;
		this.tipContract = tipContract;
		this.nrObjDetinutedeFond = nrObjDetinutedeFond;
		this.cantitateTotalaInPiata = cantitateTotalaInPiata;
		this.unitateMasura = unitateMasura;
		this.simbolParitate = simbolParitate;
		this.rataNominalaAnuala = rataNominalaAnuala;
		this.convertibilitate = convertibilitate;
		this.pretAchizitie = pretAchizitie;
		this.pretSpot = pretSpot;
		this.emitent = emitent;
		this.buyOrSell = buyOrSell;
		this.maturitate = maturitate;
		this.cantitatea = cantitatea;
		this.pips = pips;
		this.prima = prima;
		this.stragetie = stragetie;
	}

	public Instrument(Companie companie, TipInstrument tipInstr,
			TipContract tipContract, int nrObjDetinutedeFond,
			float cantitateTotalaInPiata, String unitateMasura,
			String simbolParitate, float rataNominalaAnuala,
			boolean convertibilitate, double pretAchizitie, double pretSpot,
			String emitent, boolean buyOrSell, Date maturitate, int cantitatea,
			double pips, double prima, String stragetie) {
		super();
		this.companie = companie;
		this.tipInstr = tipInstr;
		this.tipContract = tipContract;
		this.nrObjDetinutedeFond = nrObjDetinutedeFond;
		this.cantitateTotalaInPiata = cantitateTotalaInPiata;
		this.unitateMasura = unitateMasura;
		this.simbolParitate = simbolParitate;
		this.rataNominalaAnuala = rataNominalaAnuala;
		this.convertibilitate = convertibilitate;
		this.pretAchizitie = pretAchizitie;
		this.pretSpot = pretSpot;
		this.emitent = emitent;
		this.buyOrSell = buyOrSell;
		this.maturitate = maturitate;
		this.cantitatea = cantitatea;
		this.pips = pips;
		this.prima = prima;
		this.stragetie = stragetie;
	}

	public Instrument() {
		super();

	}

}
