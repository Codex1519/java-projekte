package tag07_08_grundlagen._03_Initializer;
// Der Initializer-Block wird verwendet, um gemeinsamen Initialisierungscode für alle
// Konstruktoren der Klasse zu platzieren

// Initializer werden VOR den Konstruktoren ausgeführt

// Initializer zentralisieren die Initialisierungslogik, was wiederrum die Lesbarkeit und Wartbarkeit
// verbessern kann

// Der Initializer wird realisiert, indem eine geschweifte Klammer auf und eine zu geschrieben wird.


public class Auto {
	String marke;
	int leistung;
	
	// Initialisierungsblock
	{
		marke = "BMW";
		leistung = 100;
	}
	
	public Auto() {}
	
	public Auto(String marke) {
		this.marke = marke;
	}
	
	public Auto(String marke, int leistung) {
		this.marke = marke;
		this.leistung = leistung;
	}
}
