package tag09_10_uebungen._04;

public class BruchMitSeriennummer extends Bruch {
	private static int statischeSeriennummer  = 1;
	private final int endSeriennummer;

	public int getEndSeriennummer() {
		return endSeriennummer;
	}
	
	public BruchMitSeriennummer(int zaehler, int nenner) {
		super(zaehler, nenner);
		endSeriennummer = statischeSeriennummer++;
	}
	
	@Override
	public void ausgeben() {
		super.ausgeben();
		System.out.println("Seriennummer: " + endSeriennummer);
	}
}
