package tag06_grundlagen._02_Referenzvariablen;

public class Auto {
	
	// Instanzattribute/Objektattribute
	String marke = "unbekannt";
	int ps = 0;
	int anzahlTueren = 0;
	// Variablen von Objekten einer Klasse nennt man Referenzvariable
	// Auf Attribute / Methoden des Objektes kann mit dem "."-Operator zugegriffen werden,
	// sofern diese verfügbar sind
	
	// Ebenfalls erkennbar ist der Referenztyp, Referenztypen könnnen Klassen, abstrakte Klassen, Interfaces
	// und Enums sein
	
	// Der Referenztyp definiert die Art der Objekte, auf die die Referenzvariable verweisen kann
	// Der Referenztyp bestimmt die zur Verfügung stehenden Methoden und Attribute, die über die Referenz 
	// aufgerufen werden
	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}

}
