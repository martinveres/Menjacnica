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
	public double[] getKurs() {
		return kurs;
	}
	public void setKurs(double[] kurs) {
		this.kurs = kurs;
	}
	
}
