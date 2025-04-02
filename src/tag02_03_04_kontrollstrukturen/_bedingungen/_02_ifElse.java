package tag02_03_04_kontrollstrukturen._bedingungen;

public class _02_ifElse {
	public static void main(String[] args) {
		// Verzweigungen werden in Java durch if und if-else u.a. gelöst.
		// Es muss zu einem if kein else geben, else ist optional.
		
		int zahl1 = 20;
		int zahl2 = 5;
		
		
		if(zahl1 == zahl2) {
			System.out.println("zahl1 ist gleich zahl2");
		}
		
		if (zahl1 != zahl2) {
			System.out.println("zahl2 ist nicht gleich zahl1");
		}
		
		// Bei Bedingungen, die sowohl den true und false - Fall definieren, kann man besser if-else verwenden
		// Ist ebenfalls effizienter, als das beide Bedingungen getrennt aufzuschreiben (Java benötigt weniger Ressourcen
		
		if (zahl1 == zahl2) {
			System.out.println("zahl1 ist gleich zahl2");
		}
		else {
			System.out.println("zahl2 ist nicht gleich zahl1");
		}
	}

}
