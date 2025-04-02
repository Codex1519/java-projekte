package tag09_10_grundlagen._02_toStringUeberschreiben;

public class Fahrzeug {
	protected String marke;
	protected int geschwindigkeit;
	
	public Fahrzeug() {
		this("unbekannt",0);
	}
	
	public Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	@Override
	public String toString() {
		return "Marke: " + marke + ", Geschwindigkeit: " + geschwindigkeit;
	}
}
