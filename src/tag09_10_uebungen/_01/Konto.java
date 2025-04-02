package tag09_10_uebungen._01;

public class Konto {
	
	private String kontonummer;
	private double kontostand;
	
	public Konto (String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}

	public String getKontonummer() {
		return kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}
	
	public void einzahlen(double einzahlung) {
		if(einzahlung > 0) {
			this.kontostand += einzahlung;
		}else {
			System.out.println("Nur positive Zahlen");
		}
	}
	
	public void auszahlen(double auszahlung) {
		if(auszahlung > 0 && auszahlung <= kontostand) {
			this.kontostand -= auszahlung;
		}else {
			System.out.println("Unültige Auszahlung");
		}
	}
}
