package tag09_10_uebungen._01;

public class Kontotest {

	public static void main(String[] args) {
		
		Konto konto = new Konto("0000000001", 1000);
		
		System.out.println("Kontonummer: " + konto.getKontonummer());
		System.out.println("Kontostand: " + konto.getKontostand());
		
		konto.einzahlen(500);
		System.out.println("Kontostand nach Einzahlung: " + konto.getKontostand());
		
		konto.auszahlen(750.50);
		System.out.println("Kontostand nach Auszahlung: " + konto.getKontostand());
	}
}