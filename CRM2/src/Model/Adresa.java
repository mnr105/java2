package Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresa {

	@Column(name = "NUME_STRADA")
	private String numeStrada;

	@Column(name = "NUMAR_STRADA")
	private int nrStrada;

	@Column(name = "TIP_CLADIRE")
	private String tipCladire;

	@Column(name = "NUMAR_BLOC")
	private String nrBloc;

	@Column(name = "ETAJ")
	private int etaj;

	@Column(name = "APARTAMENT")
	private int apartament;

	@Column(name = "ORAS")
	private String oras;

	@Column(name = "SECTOR")
	private String sector;

	@Column(name = "TARA")
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

	@Override
	public String toString() {
		return "Strada: " + this.getNumeStrada() + " cu numarul: "
				+ this.getNrStrada();
	}

	public Adresa() {
		super();
	}

	public Adresa(String numeStrada, int nrStrada, String tipCladire,
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

}
