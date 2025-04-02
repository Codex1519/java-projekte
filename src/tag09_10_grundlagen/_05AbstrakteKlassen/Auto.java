package tag09_10_grundlagen._05AbstrakteKlassen;

// Konkrete Unterklasse von abstrakter Fahrzeugklasse
public class Auto extends Fahrzeug {
	private int anzahlSitze;
	
	public Auto(String marke, int geschwindigkeit, int anzahlSitze) {
		super(marke, geschwindigkeit);
		this.geschwindigkeit = geschwindigkeit;
		this.anzahlSitze = anzahlSitze;
	}
	
	public void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Geschwindigkeit: " + geschwindigkeit + "km/h");
		System.out.println("Anzahl Sitze: " + anzahlSitze);
	}
	
	@Override
	public void beschleunigen(int zusatzGeschwindigkeit) {
		geschwindigkeit += zusatzGeschwindigkeit;
		System.out.println("Beschleunigung eines Autos auf: " + geschwindigkeit + "km/h");
	}
}
