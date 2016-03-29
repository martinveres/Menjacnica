package interfejsi;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface MenjacnicaInterfejs {
	public boolean dodajKursValute(GregorianCalendar datum, double[] kurs);
	public boolean obrisiKursvalute(GregorianCalendar datum);
	public double[] vratiKursValute(GregorianCalendar datum);
}
