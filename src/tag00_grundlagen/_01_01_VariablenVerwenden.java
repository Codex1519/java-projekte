package tag00_grundlagen;

public class _01_01_VariablenVerwenden {
	
	public static void main(String[] args) {
		int zahl = 10;
		double euroWert = 120.85;
		String name = "Hans";
		
		zahl = zahl + 5;			  // 15
		euroWert = euroWert - 100.00; //20.85
		System.out.println("Wie ist der Name? " + name); // Stringverkettung, Fachbegriff: Konkatenation
		
	}

}
