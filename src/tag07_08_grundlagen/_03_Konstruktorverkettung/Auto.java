package tag07_08_grundlagen._03_Konstruktorverkettung;

public class Auto {
	String marke;
	String typ;
	String antriebsart;
	String farbe;
	int anzahlTueren;
	int sitze;
	
	
	
	public Auto(String marke, String typ, String farbe) {
		this(marke, typ, "Frontantrieb", farbe, 5,4);		
	}
	
	// public Auto(String, String, String, String, int, int)
	
	public Auto(String marke, String typ, String antriebsart, String farbe) {
		this(marke, typ, antriebsart, farbe, 5, 4);
	}
	
	public Auto(String marke, String typ, String antriebsart, String farbe, int anzahlTueren) {
		this(marke, typ, antriebsart, farbe, anzahlTueren, 4);
	}
	
	
	
	// Hauptkonstruktor mit allen Parametern
	public Auto(String marke, String typ, String antriebsart, String farbe, int anzahlTueren, int sitze) {
		this.marke = marke;
		this.typ = typ;
		this.antriebsart = antriebsart;
		this.farbe = farbe;
		this.anzahlTueren = anzahlTueren;
		this.sitze = sitze;
	}
	
	
	
	
	
	
}
