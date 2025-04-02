package tag09_10_uebungen._04;

public class Seriennummertest {

	public static void main(String[] args) {
		// erstmal Objekte erstellen
		BruchMitSeriennummer bruch = new BruchMitSeriennummer(5,2);
		BruchMitSeriennummer bruch1 = new BruchMitSeriennummer(9,8);
		BruchMitSeriennummer bruch2 = new BruchMitSeriennummer(12,5);
		BruchMitSeriennummer bruch3 = new BruchMitSeriennummer(21,7);
		BruchMitSeriennummer bruch4 = new BruchMitSeriennummer(12,6);
		
		bruch.ausgeben();
		bruch1.ausgeben();
		bruch2.ausgeben();
		bruch3.ausgeben();
		bruch4.ausgeben();
		
		
	}

}
