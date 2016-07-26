package inutile;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bGarantie")
public class bGarantie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Garantie")
	private Long idGarantie;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_portof")
	private cPortofoliu portofoliu;

	@Column(name = "tip_instrument")
	private String tipInstument;

	@Column(name = "unitate_Masura")
	private String unitateMasura;

	@Column(name = "tip_contract")
	private TipContract tipC;

	@Column(name = "pret_Achizitie")
	private double pretAchizitie;

	@Column(name = "pret_Spot")
	private double pretSpot;

	@Column(name = "emitent")
	private String emitent;

	@Column(name = "nr_Obj_Detin")
	private int nrObjDetinutedeFond;

	@Column(name = "buyOrSell")
	private boolean buyOrSell;

	@Column(name = "maturitate")
	private Date maturitate;

	@Column(name = "cantitatea")
	private int cantitatea;

	@Column(name = "pips")
	private double pips;

	@Column(name = "prima")
	private double prima;

	@Column(name = "stragetie")
	private String stragetie;

	@Column(name = "nune_Intrs")
	private String nuneIntrs;

	@Column(name = "de_Cand")
	private Date deCand;

	@Column(name = "pana_Cand")
	private Date panaCand;

	public Long getIdGarantie() {
		return idGarantie;
	}

	public void setIdGarantie(Long idGarantie) {
		this.idGarantie = idGarantie;
	}

	public cPortofoliu getPortofoliu() {
		return portofoliu;
	}

	public void setPortofoliu(cPortofoliu portofoliu) {
		this.portofoliu = portofoliu;
	}

	public String getTipInstument() {
		return tipInstument;
	}

	public void setTipInstument(String tipInstument) {
		this.tipInstument = tipInstument;
	}

	public String getUnitateMasura() {
		return unitateMasura;
	}

	public void setUnitateMasura(String unitateMasura) {
		this.unitateMasura = unitateMasura;
	}

	public TipContract getTipC() {
		return tipC;
	}

	public void setTipC(TipContract tipC) {
		this.tipC = tipC;
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

	public bGarantie(Long idGarantie, cPortofoliu portofoliu,
			String tipInstument, String unitateMasura, TipContract tipC,
			double pretAchizitie, double pretSpot, String emitent,
			int nrObjDetinutedeFond, boolean buyOrSell, Date maturitate,
			int cantitatea, double pips, double prima, String stragetie,
			String nuneIntrs, Date deCand, Date panaCand) {
		super();
		this.idGarantie = idGarantie;
		this.portofoliu = portofoliu;
		this.tipInstument = tipInstument;
		this.unitateMasura = unitateMasura;
		this.tipC = tipC;
		this.pretAchizitie = pretAchizitie;
		this.pretSpot = pretSpot;
		this.emitent = emitent;
		this.nrObjDetinutedeFond = nrObjDetinutedeFond;
		this.buyOrSell = buyOrSell;
		this.maturitate = maturitate;
		this.cantitatea = cantitatea;
		this.pips = pips;
		this.prima = prima;
		this.stragetie = stragetie;
		this.nuneIntrs = nuneIntrs;
		this.deCand = deCand;
		this.panaCand = panaCand;
	}

	public bGarantie(cPortofoliu portofoliu, String tipInstument,
			String unitateMasura, TipContract tipC, double pretAchizitie,
			double pretSpot, String emitent, int nrObjDetinutedeFond,
			boolean buyOrSell, Date maturitate, int cantitatea, double pips,
			double prima, String stragetie, String nuneIntrs, Date deCand,
			Date panaCand) {
		super();
		this.portofoliu = portofoliu;
		this.tipInstument = tipInstument;
		this.unitateMasura = unitateMasura;
		this.tipC = tipC;
		this.pretAchizitie = pretAchizitie;
		this.pretSpot = pretSpot;
		this.emitent = emitent;
		this.nrObjDetinutedeFond = nrObjDetinutedeFond;
		this.buyOrSell = buyOrSell;
		this.maturitate = maturitate;
		this.cantitatea = cantitatea;
		this.pips = pips;
		this.prima = prima;
		this.stragetie = stragetie;
		this.nuneIntrs = nuneIntrs;
		this.deCand = deCand;
		this.panaCand = panaCand;
	}

	public bGarantie() {
		super();
	}

}
