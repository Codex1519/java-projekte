package tag09_10_grundlagen._06_InterfacesVerwenden;

public abstract class Fahrzeug implements KannBeschleunigen {
	protected String marke;
	protected int geschwindigkeit;
	
	public Fahrzeug() {}
	
	public Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	// Abstrakte Methode, die von Unterklassen implementiert werden müssen
	public void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Geschwindigkeit: " + geschwindigkeit + "km/h");
	}
	
	public void beschleunigen(int zusatzGeschwindigkeit) {
		geschwindigkeit += zusatzGeschwindigkeit;
	}
}
