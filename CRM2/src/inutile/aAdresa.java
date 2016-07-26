package inutile;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class aAdresa {

	@Column(name = "Nume_strada")
	private String numeStrada;

	@Column(name = "numar_strada")
	private int nrStrada;

	@Column(name = "tip_cladire")
	private String tipCladire;

	@Column(name = "numar_bloc")
	private String nrBloc;

	@Column(name = "etaj")
	private int etaj;

	@Column(name = "apart")
	private int apartament;

	@Column(name = "oras")
	private String oras;

	@Column(name = "sector")
	private String sector;

	@Column(name = "tara")
	private String tara;

	public String getNumeStrada() {
		return numeStrada;
	}

	public void setNumeStrada(String numeStrada) {
		this.numeStrada = numeStrada;
	}

	public String getTipCladire() {
		return tipCladire;
	}

	public void setTipCladire(String tipCladire) {
		this.tipCladire = tipCladire;
	}

	public int getNrStrada() {
		return nrStrada;
	}

	public void setNrStrada(int nrStrada) {
		this.nrStrada = nrStrada;
	}

	public String getBloc() {
		return tipCladire;
	}

	public void setBloc(String bloc) {
		this.tipCladire = bloc;
	}

	public String getNrBloc() {
		return nrBloc;
	}

	public void setNrBloc(String nrBloc) {
		this.nrBloc = nrBloc;
	}

	public int getEtaj() {
		return etaj;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public int getApartament() {
		return apartament;
	}

	public void setApartament(int apartament) {
		this.apartament = apartament;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public aAdresa() {
		super();

	}

	public aAdresa(String numeStrada, int nrStrada, String tipCladire,
			String nrBloc, int etaj, int apartament, String oras,
			String sector, String tara) {
		super();
		this.numeStrada = numeStrada;
		this.nrStrada = nrStrada;
		this.tipCladire = tipCladire;
		this.nrBloc = nrBloc;
		this.etaj = etaj;
		this.apartament = apartament;
		this.oras = oras;
		this.sector = sector;
		this.tara = tara;
	}

	@Override
	public String toString() {
		return "Strada: " + this.getNumeStrada() + " cu numarul: "
				+ this.getNrStrada();
	}

}
