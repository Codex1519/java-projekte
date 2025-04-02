package tag09_10_uebungen._02;

public class Konto {
	
	protected String kontonummer;
	protected double kontostand;
	
	public Konto (String kontonummer, double kontostand) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}
	
	public Konto() {}

	public String getKontonummer() {
		return kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}
	
	public void einzahlen(double einzahlung) {
		if(einzahlung > 0) {
			kontostand += einzahlung;
		}else {
			System.out.println("Nur positive Zahlen");
		}
	}
	
	public void auszahlen(double auszahlung) {
		if(auszahlung > 0 && auszahlung <= kontostand) {
			kontostand -= auszahlung;
		}else {
			System.out.println("Unültige Auszahlung");
		}
	}
}
