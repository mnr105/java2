package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COMPANII")
public class Companie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_COMPANIE")
	private Long idCompanie;

	@OneToOne(mappedBy = "companie")
	private Instrument instument;

	@Column(name = "NUME_COMPANIE")
	private String numeCompanie;

	@Column(name = "TARA_COMPANIE")
	private Tara taraCompanie;

	@Column(name = "SIMBOL_PIATA_CAPITAL")
	private String simbolPiataCapital;

	@Column(name = "CAPITAL_PROPIU")
	private double capitalPropiu;

	@Column(name = "CAPITAL_SOCIAL")
	private double capitalSocial;

	@Column(name = "PROFIT_NET_TRIMESTRIAL")
	private double profitNetTrimestrial;

	@Column(name = "NUMAR_ANGAJATI")
	private int numarAngajati;

	@Column(name = "PROFIT_NET_REPARTIZAT")
	private double pofitNetRepartizat;// pt calc divident

	@Column(name = "IPO")
	private Date ipo;

	@Column(name = "NR_ACT_IPO")
	private int nrActIpo;

	@Column(name = "PRET_ACT_IPO")
	private double pretActIpo;

	@ElementCollection
	@CollectionTable(name = "DATE_EMISIUNI", joinColumns = @JoinColumn(name = "ID_COMPANIE"))
	@Column(name = "ALTE_EMISIUNI")
	private List<Date> alteEmisiuni;

	@Column(name = "NR_TOTAL_ACTIUNI")
	private int nrTotalActiuni;

	public Long getId() {
		return idCompanie;
	}

	public void setIdCompanie(Long idCompanie) {
		this.idCompanie = idCompanie;
	}

	public String getNumeCompanie() {
		return numeCompanie;
	}

	public void setNumeCompanie(String numeCompanie) {
		this.numeCompanie = numeCompanie;
	}
	

	public Tara getTaraCompanie() {
		return taraCompanie;
	}

	public void setTaraCompanie(Tara taraCompanie) {
		this.taraCompanie = taraCompanie;
	}

	public String getSimbolPiataCapital() {
		return simbolPiataCapital;
	}

	public void setSimbolPiataCapital(String simbolPiataCapital) {
		this.simbolPiataCapital = simbolPiataCapital;
	}

	public double getCapitalPropiu() {
		return capitalPropiu;
	}

	public void setCapitalPropiu(double capitalPropiu) {
		this.capitalPropiu = capitalPropiu;
	}

	public double getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public double getProfitNetTrimestrial() {
		return profitNetTrimestrial;
	}

	public void setProfitNetTrimestrial(double profitNetTrimestrial) {
		this.profitNetTrimestrial = profitNetTrimestrial;
	}

	public int getNumarAngajati() {
		return numarAngajati;
	}

	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}

	public double getPofitNetRepartizat() {
		return pofitNetRepartizat;
	}

	public void setPofitNetRepartizat(double pofitNetRepartizat) {
		this.pofitNetRepartizat = pofitNetRepartizat;
	}

	public Date getIpo() {
		return ipo;
	}

	public void setIpo(Date ipo) {
		this.ipo = ipo;
	}

	public int getNrActIpo() {
		return nrActIpo;
	}

	public void setNrActIpo(int nrActIpo) {
		this.nrActIpo = nrActIpo;
	}

	public double getPretActIpo() {
		return pretActIpo;
	}

	public void setPretActIpo(double pretActIpo) {
		this.pretActIpo = pretActIpo;
	}

	public List<Date> getAlteEmisiuni() {
		return alteEmisiuni;
	}

	public void setAlteEmisiuni(List<Date> alteEmisiuni) {
		this.alteEmisiuni = alteEmisiuni;
	}

	public int getNrTotalActiuni() {
		return nrTotalActiuni;
	}

	public void setNrTotalActiuni(int nrTotalActiuni) {
		this.nrTotalActiuni = nrTotalActiuni;
	}

	public Instrument getInstument() {
		return instument;
	}

	public void setInstument(Instrument instument) {
		this.instument = instument;
	}

	public Long getIdCompanie() {
		return idCompanie;
	}



	public Companie(Long idCompanie, Instrument instument, String numeCompanie,
			Tara taraCompanie, String simbolPiataCapital, double capitalPropiu,
			double capitalSocial, double profitNetTrimestrial,
			int numarAngajati, double pofitNetRepartizat, Date ipo,
			int nrActIpo, double pretActIpo, List<Date> alteEmisiuni,
			int nrTotalActiuni) {
		super();
		this.idCompanie = idCompanie;
		this.instument = instument;
		this.numeCompanie = numeCompanie;
		this.taraCompanie = taraCompanie;
		this.simbolPiataCapital = simbolPiataCapital;
		this.capitalPropiu = capitalPropiu;
		this.capitalSocial = capitalSocial;
		this.profitNetTrimestrial = profitNetTrimestrial;
		this.numarAngajati = numarAngajati;
		this.pofitNetRepartizat = pofitNetRepartizat;
		this.ipo = ipo;
		this.nrActIpo = nrActIpo;
		this.pretActIpo = pretActIpo;
		this.alteEmisiuni = alteEmisiuni;
		this.nrTotalActiuni = nrTotalActiuni;
	}
	
	public Companie(Instrument instument, String numeCompanie,
			Tara taraCompanie, String simbolPiataCapital, double capitalPropiu,
			double capitalSocial, double profitNetTrimestrial,
			int numarAngajati, double pofitNetRepartizat, Date ipo,
			int nrActIpo, double pretActIpo, List<Date> alteEmisiuni,
			int nrTotalActiuni) {
		super();
		this.instument = instument;
		this.numeCompanie = numeCompanie;
		this.taraCompanie = taraCompanie;
		this.simbolPiataCapital = simbolPiataCapital;
		this.capitalPropiu = capitalPropiu;
		this.capitalSocial = capitalSocial;
		this.profitNetTrimestrial = profitNetTrimestrial;
		this.numarAngajati = numarAngajati;
		this.pofitNetRepartizat = pofitNetRepartizat;
		this.ipo = ipo;
		this.nrActIpo = nrActIpo;
		this.pretActIpo = pretActIpo;
		this.alteEmisiuni = alteEmisiuni;
		this.nrTotalActiuni = nrTotalActiuni;
	}

	public Companie() {
		super();

	}

}
