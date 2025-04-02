package tag09_10_grundlagen._01_erbenVonKonkretenKlassen;

public class Auto extends Fahrzeug {
	private int anzahlSitze;
	
	public Auto(String marke, int geschwindigkeit, int anzahlSitze) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
		this.anzahlSitze = anzahlSitze;
	}
	
	public void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Geschwindigkeit: "+ geschwindigkeit + "km/h");
		System.out.println("Anzahl Sitze: " + anzahlSitze);
	}

}
