package tag06_grundlagen._01_Klassen;

public class Auto {
	
	// Attribute/Eigenschaften(property)/Felder(fields) nennt man auch Zustände
	
	
	// Instanzattribute/Objektattribut
	String marke = "unbekannt";
	int ps = 0;
	
	void zeigeDetails() {
		System.out.println("Marke: " + marke);
		System.out.println("PS: " + ps);
	}

	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.marke  = "Seat";
		meinAuto.ps = 170;
		
		meinAuto.zeigeDetails();
	}

}
