package valuta;

public class Valuta {
	private String naziv;
	private String skracenica;
	private double[] kurs = new double[3];
	/* kurs[0] prodajni, kurs[1] srednji, kurs[2] kupovni */
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Exception {
		if(naziv!=null) {
		this.naziv = naziv;
		}
		else {
			throw new Exception("Naziv ne moze biti null vrednost.");
		}
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) throws Exception {
		if(skracenica!=null) {
			this.skracenica = skracenica;
		}
		else {
			throw new Exception("Greska. Skracenica ne moze biti null vrednost. ");
		}
	}
	public double[] getKurs() {
		return kurs;
	}
	public void setKurs(double[] kurs) throws Exception {
		if(kurs!=null) {
			this.kurs = kurs;
		}
		else {
			throw new Exception("Kurs ne moze biti null vrednost!");
		}
	}
	@Override
	public String toString() {
		return getNaziv() + getSkracenica() + " Srednji kurs: " + kurs[1];
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Valuta) {
			if(((Valuta) obj).getNaziv().equals(getNaziv())) {
				return true;
			}
		}
		return false;
	}
	
}
