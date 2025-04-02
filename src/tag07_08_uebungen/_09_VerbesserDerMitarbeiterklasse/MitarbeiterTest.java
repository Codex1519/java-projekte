package tag07_08_uebungen._09_VerbesserDerMitarbeiterklasse;

public class MitarbeiterTest {

	public static void main(String[] args) {
		// Erstellen eines Mitarbeiterobjekts mit dem Default-Konstruktor
		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
		mitarbeiter1.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Erstellen eines Mitarbeiterobjekts mit dem überladenen Konstruktor
	
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("EMP002", "Maria Müller", "Manager");
		mitarbeiter2.setGehalt(75000);
		mitarbeiter2.setErfahrungsjahre(8);
		mitarbeiter2.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Erstellen eines Mitarbeiterobjektes mit allen Attributen
		Mitarbeiter mitarbeiter3 = new Mitarbeiter("EMP003", "John Doe", "Designer", 45000, 3);
		mitarbeiter3.zeigemitarbeiterInfo();
		
		System.out.println();
		
		// Test Validierungslogik
		Mitarbeiter mitarbeiter4 = new Mitarbeiter();
		mitarbeiter4.setMitarbeiterID("");
		mitarbeiter4.setGehalt(-1000);
		mitarbeiter4.setErfahrungsjahre(-5);
	}
}
