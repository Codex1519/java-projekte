package tag09_10_uebungen._02;

public class Girokonto extends Konto{
	private double limit;
	
	public Girokonto(String kontonummer, double kontostand, double limit) {
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
    
	@Override
	public void auszahlen(double betrag) {
		if(this.getKontostand() - betrag >= limit * -1) {
			this.kontostand -= betrag;
		}else {
			System.out.println("Auszahlung nicht möglich.");
		}
	}
	
}



