package tag09_10_grundlagen._04_superVererben;

public class Fahrzeug {
	protected String marke;
	protected int geschwindigkeit;
	
	public Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Geschwindigkeit: "+ geschwindigkeit + "km/h");
	}
}
