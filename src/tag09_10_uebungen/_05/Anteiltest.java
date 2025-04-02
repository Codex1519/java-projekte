package tag09_10_uebungen._05;

public class Anteiltest {

	public static void main(String[] args) {
		int vermoegen = 200_000;
		
		Anteil ant1 = new Anteil(1,4);
		Anteil ant2 = new Anteil(2,4);
		
		
		System.out.println("Anteil ant1: " + ant1.bruchToString());
		System.out.println("Betrag von ant1: " + vermoegen * ant1.dezimalwert());
		
		System.out.println();
		
		System.out.println("Anteil ant2: " + ant2.bruchToString());
		System.out.println("Betrag von ant2: " + vermoegen * ant2.dezimalwert());
		
		System.out.println();
		System.out.println("Verteilt: " + Anteil.getVerteiltAlsBruch().bruchToString());
		System.out.println("Rest: " + Anteil.getRest().bruchToString());
		System.out.println("Restbetrag: " + vermoegen * Anteil.getRest().dezimalwert());		
	}

}
