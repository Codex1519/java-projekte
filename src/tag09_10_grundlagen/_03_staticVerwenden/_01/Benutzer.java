package tag09_10_grundlagen._03_staticVerwenden._01;

public class Benutzer {
	private String name;
	private static int benutzerZaehler = 0;
	
	// Konstruktor
	public Benutzer(String name) {
		this.name = name;
		benutzerZaehler++;
	}
	
	public void setzeZaehler(int zahl) {
		benutzerZaehler = zahl;
	}
	
	// Getter für den Benutzerzähler
	public static int getBenutzerZaehler() {
		//name = "Yves"; // funktioniert nicht
		return benutzerZaehler;
	}
}	
