package tag06_grundlagen._02_Methoden._01_einfacheMethode;

public class Auto {
	// Instanzattribut/Objektattribut
	String marke = "unbekannt";
	int ps = 0;

	// Klassen haben neben Instanzattribute Methoden / Fähigkeiten
	// Wenn wir uns nicht in der OOP bewegen, heißen Methoden eher Funktion /
	// Prozedur
	// Methoden haben Zugriff auf Instanzattribute, können diese lesen, schreiben
	// oder manipulieren
	// Werden auch Instanzmethode genannt, werden also auf der konkreten Instanz /
	// Objekt aufgerufen
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}

}
