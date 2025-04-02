package tag07_08_grundlagen._04_MethodenUeberladen;
// Methoden in Java können überladen werden
// Man überlädt eine Methode, indem man eine Methode mit demselben Namen, jedoch einer
// unterschiedlichen Anzahl oder Reihenfolge an Parametern / Datentypen, erstellt

// Anstatt die Anzahl der Parameter zu verändern, recht es auch aus, den Datentyp zu verändern
// und die Anzahl beizubehalten

// Der Rückgabewert einer überladenen Methode darf sich unterscheiden, muss es aber nicht 

// Was bringts ? Code-Duplikation kann vermieden werden. Höhere Flexibilität.

public class Auto {
	String marke;
	int leistung;
	String farbe;
	
	// Methode zur Einstellung der Leistung
	public void setzeDetails(int leistung) {
		this.leistung = leistung;
	}
	// Methode zut Einstellung der Marke und der Leistung
	public void setzeDetails(String marke, int leistung) {
		this.marke = marke;
		this.leistung = leistung;
	}
	// Methode zur Einstellung der Marke, der Leistung und der Farbe	
	public void setzeDetails(String marke, int leistung, String farbe) {
		this.marke = marke;
		this.leistung = leistung;
		this.farbe = farbe;
	}
}
