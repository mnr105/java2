package inutile;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cCompania")
public class cCompania {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_comp")
	private Long id;
	
	@Column(name = "nume")
	private String nume;
	
	@Column(name = "tara")
	private String tara;
	
	@Column(name = "simbol_Piata_Capital")
	private String simbolPiataCapital;
	
	@Column(name = "capital_Propiu")
	private double capitalPropiu;
	
	@Column(name = "capitalSocial")
	private double capitalSocial;
	
	@Column(name = "profitNetTrimestrial")
	private double profitNetTrimestrial;
	
	@Column(name = "numarAngajati")
	private int numarAngajati;
	
	@Column(name = "pofitNetRepartizat")
	private double pofitNetRepartizat;// pt calc divident
	
	@Column(name = "ipo")
	private Date ipo;
	
	@Column(name = "nrActIpo")
	private int nrActIpo;
	
	@Column(name = "pretActIpo")
	private double pretActIpo;
	
	@ElementCollection
	@CollectionTable(name = "date_emisiuni", joinColumns = @JoinColumn(name = "Id_comp"))
	@Column(name = "alte_Emisiuni")
	private List<Date> alteEmisiuni;
	
	@Column(name = "nrTotalActiuni")
	private int nrTotalActiuni;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
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

	public cCompania(Long id, String nume, String tara,
			String simbolPiataCapital, double capitalPropiu,
			double capitalSocial, double profitNetTrimestrial, int numarAngajati,
			double pofitNetRepartizat, Date ipo, int nrActIpo, double pretActIpo,
			List<Date> alteEmisiuni, int nrTotalActiuni) {
		super();
		this.id = id;
		this.nume = nume;
		this.tara = tara;
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

	public cCompania(String nume, String tara,
			String simbolPiataCapital,
			double capitalPropiu, double capitalSocial,
			double profitNetTrimestrial, int numarAngajati,
			double pofitNetRepartizat, Date ipo, int nrActIpo,
			double pretActIpo,
			List<Date> alteEmisiuni, int nrTotalActiuni) {
		super();
		this.nume = nume;
		this.tara = tara;
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

}
