package tag07_08_uebungen._07;

public class Rechteck {
	
	private  double laenge;
	private double breite;
	
	
	
	
	

	
	
	
	// Ab hier Aufgabe 04 Erweitern der Klasse Rechteck mit Methoden
	
	
	public void laengeVergroessern(double laenge) {
		this.laenge += laenge;
	}
	
	public void breiteVergroessern(double breite) {
		this.breite += breite;
	}
	
	public void laengeVerkleinern(double laenge) {
		this.laenge -= laenge;
	}
	
	public void breiteVerkleinern(double breite) {
		this.breite -= breite;
	}
	
	// Ab hier Aufgabe 03 Lokale Variable
	// erstellen der Methode mit einer Variable
	void laengeAusgeben() {
		var laenge = 5.4;
		System.out.println("Länge: " + laenge);
	}
	
	
	// Konstruktor mit leerer Parameterliste
	public Rechteck() {
		this.laenge = 0;
		this.breite = 0;
	}
	// Konstruktor mit (Übergabe)Parametern
	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	// Setter-Methoden
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	public void setSeiten(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	// Getter-Methoden
	public double getLaenge() {
		return laenge;
	}
	
	public double getBreite() {
		return breite;
	}
	
	public double getLangeSeite() {
		return Math.max(laenge, breite);
	}
	
	public double getKurzeSeite() {
		return Math.min(laenge, breite);
	}
	
	public double getDiagonale() {
		return Math.sqrt(laenge * laenge + breite * breite);
	}
	
	public double getFlaeche() {
		return laenge * breite;
	}
	
	public double getUmfang() {
		return 2 * (laenge + breite);
	}
	
}
