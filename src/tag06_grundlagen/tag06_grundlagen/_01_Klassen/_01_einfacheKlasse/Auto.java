package tag06_grundlagen._01_Klassen._01_einfacheKlasse;
//Klassen sind selbst definierte Typen, werden auch "komplexe Datentypen" genannt
//Unterscheidet sie von den uns bekannten primitiven Datentypen
//Klassen stellen eine Blueprint (Blaupause, Bauplan) für das Objekt dar
//Klassen sind eine Sammlung von Zuständen und Fähigkeiten eines Objektes (instance)
//Klassen lassen sich vererben

public class Auto {

	// Attribute/Eigenschaften(property)/Felder(fields) nennt man auch Zustände
	
	// Instanzattribut/Objektattribut
	String marke = "unbekannt";
	int ps = 0;
	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}
	
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.marke = "Seat";
		meinAuto.ps = 170;

		meinAuto.zeigeDetails();
	}

}
