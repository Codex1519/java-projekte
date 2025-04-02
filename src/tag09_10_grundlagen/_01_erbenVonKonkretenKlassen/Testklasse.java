package tag09_10_grundlagen._01_erbenVonKonkretenKlassen;

public class Testklasse {
	public static void main(String[] args) {
		Fahrzeug fahrzeug = new Fahrzeug ("Volvo", 100);
		fahrzeug.zeigeDetails();
		
		Auto auto = new Auto("Skoda", 160, 5);
		auto.zeigeDetails();
		
		
	}

}
