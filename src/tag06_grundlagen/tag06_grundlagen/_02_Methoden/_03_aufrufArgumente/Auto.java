package tag06_grundlagen._02_Methoden._03_aufrufArgumente;

public class Auto {
	// Instanzattribut/Objektattribut
	String marke = "unbekannt";
	int ps = 0;

	// Instanzmethode
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}

	// Methode zum Setzen der Fahrzeugdetails
	// parMarke & parLeistung sind (Übergabe)Parameter
	// die die Methode verwendet
	void setzeDetails(String parMarke, int parLeistung) {
		marke = parMarke;
		ps = parLeistung;
	}
}
