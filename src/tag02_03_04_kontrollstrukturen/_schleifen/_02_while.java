package tag02_03_04_kontrollstrukturen._schleifen;

public class _02_while {

	public static void main(String[] args) {
		// Kopfgesteuerte Schleifen: Bedingung wird zu Beginn geprüft, das bedeutet, die Schleife
		// wird eventl. gar nicht ausgeführt, wenn die Bedingung nicht wahr ist.
		
		// Fußgesteuerte Schleifen: Bedingung wird zum Ende des Schleifenkörpers geprüft, weshalb
		// der Schleifenkörper mindestens einmal durchgeführt wird.
		
		// While Schleife gehört zu den kopfgesteurten Schleifen
		
		int zaehler = 0;
		
		// Solange die Schleifenbedingung wahr ist, wird der Schleifenkörper iterativ ausgeführt.
		while (zaehler < 5) {
			System.out.println("Aktueller Zähler: " + zaehler);
			zaehler++;
		}

	}

}
