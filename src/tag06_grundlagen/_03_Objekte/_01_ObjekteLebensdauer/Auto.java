package tag06_grundlagen._03_Objekte._01_ObjekteLebensdauer;

public class Auto {
	int ps = 170;
	String marke; 

	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("Anzahl Türen: " + anzahlTueren);
		System.out.println("Motorleistung:" + meinMotor.leistung);
		System.out.println("Typ:" + meinMotor.typ);
	}
}
