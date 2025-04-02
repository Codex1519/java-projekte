package tag06_grundlagen._02_eigeneMainKlasse;

public class Auto {
	
	// Instanzattribute/Objektattribute
	String marke = "unbekannt";
	int ps = 0;
	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}

}
