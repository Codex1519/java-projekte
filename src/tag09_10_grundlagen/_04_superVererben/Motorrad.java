package tag09_10_grundlagen._04_superVererben;

public class Motorrad extends Fahrzeug {
	boolean helmpflicht;
	
	//Kontstruktor
	public Motorrad(String marke, int geschwindigkeit, boolean helmpflicht) {
		// Konstruktor der Oberklasse mit zwei Parametern (String, int) wird aufgerufen
		super(marke,geschwindigkeit);
		this.helmpflicht = helmpflicht;
	}
	
	@Override
	public void zeigeDetails() {
		// Aufruf der Methode der Oberklasse / Superklasse ...
		super.zeigeDetails();
		System.out.println("Helmpflicht: " + (helmpflicht ? "ja" : "nein"));
	}
}
