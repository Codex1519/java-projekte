package tag09_10_grundlagen._05AbstrakteKlassen;

public abstract class Fahrzeug {
	protected String marke;
	protected int geschwindigkeit;
	
	public Fahrzeug() {
	}
	
	public Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	// Abstrakte Methode, die von Unterklassen implementiert werden müssen
	public abstract void zeigeDetails();
	
	// Konkrete Methoden können von Unterklassen direkt verwendet werden, da sie 
	// bereits eine Implementierung besitzen
	public void beschleunigen(int zusatzGeschwindigkeit) {
		geschwindigkeit += zusatzGeschwindigkeit;
		System.out.println("Beschleunigung auf " + geschwindigkeit + "km/h");
	}
}
