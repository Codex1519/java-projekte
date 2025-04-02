package tag07_08_uebungen._08;

public class MitarbeiterTest {

	public static void main(String[] args) {
		
		// TEST Default-Konstruktor
		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
		mitarbeiter1.setMitarbeiterID("EMP001");
		mitarbeiter1.setGehalt(5000);
		mitarbeiter1.setErfahrungsJahre(5);
		mitarbeiter1.mitarbeiterdatenausgeben();
		
		
		// Konstruktor mit 3 Parameter
		Mitarbeiter mitarbeiter2 = new Mitarbeiter("EMP002","Maria Müller", "Manager");
		mitarbeiter2.setGehalt(7500);
		mitarbeiter2.setErfahrungsJahre(8);
		mitarbeiter2.mitarbeiterdatenausgeben();
		
		Mitarbeiter mitarbeiter3 = new Mitarbeiter("EMP003", "John Doe", "Desginer", 45000,3);
		mitarbeiter3.mitarbeiterdatenausgeben();
		
		// Validierung testen auf falsche Werte
		Mitarbeiter validierungWerte = new Mitarbeiter();
		validierungWerte.setMitarbeiterID("");
		validierungWerte.setGehalt(-50000);
		validierungWerte.setErfahrungsJahre(-5);
	}

}
