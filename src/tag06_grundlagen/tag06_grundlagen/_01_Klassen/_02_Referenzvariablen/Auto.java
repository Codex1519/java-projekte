package tag06_grundlagen._01_Klassen._02_Referenzvariablen;

public class Auto {
	// Instanzattribut/Objektattribut
	String marke = "unbekannt";
	int anzahlTueren = 0;
	// Variablen von Objekten einer Klasse nennt man Referenzvariable
	// Auf Attribute / Methoden des Objektes kann mit dem "."-Operator zugegriffen werden,
	// sofern diese verfügbar sind
	
	// Ebenfalls erkennbar ist der Referenztyp, Referenztypen können Klassen, abstrakte Klassen, Interfaces
	// und Enums sein
	
	// Der Referenztyp definiert die Art der Objekte, auf die die Referenzvariable verweisen kann
	// Der Referenztyp bestimmt die zur Verfügung stehenden Methoden und Attribute, die über die Referenz
	// aufgerufen werden
	Motor meinMotor = new Motor();
	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Anzahl Türen: " + anzahlTueren);
		System.out.println("Motorleistung:" + meinMotor.leistung);
		System.out.println("Typ:" + meinMotor.typ);
	}
}
