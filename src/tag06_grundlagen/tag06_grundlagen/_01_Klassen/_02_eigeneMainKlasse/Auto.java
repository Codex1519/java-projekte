package tag06_grundlagen._01_Klassen._02_eigeneMainKlasse;

public class Auto {
	// Instanzattribut/Objektattribut
	String marke = "unbekannt";
	int ps = 0;
	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}
}
