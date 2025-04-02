package tag00_grundlagen;

public class _07_Kurzschlussauswertung {
	
	public static void main(String[] args) {
		// heißt im englischen auch "Short-Circuit-Evaluation"
		// Wenn bei einer &&-Auswertung das Ergebnis false && ... ist, 
		// wird der rechte Teil nicht mehr ausgewertet
		
		// Wenn bei einer ||- Auswertung das Ergebnis true || ... ist,
		// wird der Teil nicht mehr ausgewertet, weil das Ergebnis schon feststeht
		
		int a = 10;
		int b = 5;
		
		boolean c = a > 10&& b++ == 5;
		System.out.println(c);
		System.out.println(b); // b ändert sich nicht, wegen S-C-E
		
	
		boolean e = a == 10 || b++ < 10;
		System.out.println(e);
		System.out.println(b);
		
		boolean d = a != 10 & b++ < 10;
		System.out.println(d);
		System.out.println(b); // jetzt 6, da kein S-C-E
		
		boolean f = a == 10 | b++ < 10;
		System.out.println(f);
		System.out.println(b); // jetzt 7, da kein S-C-E
	}

}
