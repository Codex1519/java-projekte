package tag06_grundlagen._02_Methoden._04_Rückgabewerte;

public class Auto {
	// Instanzattribut/Objektattribut
	String marke = "unbekannt";
	int ps = 0;

	// Instanzmethode
	String zeigeDetails() {
		String details = "Marke: " + marke + "\nLeistung: " + ps + " PS";
		return details;
	}

	// Methode zum Setzen der Fahrzeugdetails
	// parMarke & parLeistung sind (Übergabe)Parameter
	// die die Methode verwendet
	void setzeDetails(String parMarke, int parLeistung) {
		marke = parMarke;
		ps = parLeistung;
	}
}
