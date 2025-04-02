package tag09_10_grundlagen._03_staticVerwenden._02;

public class Testklasse {

	public static void main(String[] args) {
		int maxWert = MathUtils.max(10, 18);
		int quadratEinerZahl = MathUtils.square(5);
		
		System.out.println("Maximalwert von 10 und 18 ist: " + maxWert);
		System.out.println("Das Quadrat der Zahl 5 ist: " + quadratEinerZahl);
	}

}
