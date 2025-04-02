package tag05_01_VertiefungBekannterKonzepteSwitchCase._2_BedingungenUndSchleifenOhneKlammern;

public class SchleifenOhneKlammern {

	public static void main(String[] args) {
		// Geschweifte Klammern bei Schleifen weglassen ist definitiv keine best practice und sollte wenn
		// überhaupt sparsam eingesetzt werden
		
		// for-Schleife
		for(int i = 0; i < 5; i++) System.out.println("for-Schleife: i: " + i);
		
		// while-Schleife
		int x = 5;
		while (x > 0) System.out.println("While: x: " + x--);
		
		// do-while-Schleife
		do
			System.out.println("Do-While: x: x++");
		while (x < 5);
	}

}
