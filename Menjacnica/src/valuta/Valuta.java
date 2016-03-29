package valuta;

public class Valuta {
	private String naziv;
	private String skracenica;
	private double[] kurs = new double[3];
	/* kurs[0] prodajni, kurs[1] srednji, kurs[2] kupovni */
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Valuta) {
			if(((Valuta) obj).getNaziv().equals(this.getNaziv())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return getNaziv() + " " + getSkracenica() + " PR: " + kurs[0] + " SR: " + kurs[1] + " KUP: " + kurs[2];
	}
	@Override
	public int hashCode() {
		return 0;
		
	}
}
