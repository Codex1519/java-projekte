package tag02_03_04_kontrollstrukturen._bedingungen;

public class _02_ternaererOperator {

	public static void main(String[] args) {
		int alter = 20;
		
		//Standard ternärer Operator
		String ergebnis = alter >= 18 ? "Erwachsener" : "Minderjährig";
		
		// Verschachtelter ternärer Operator
		String ergebnis2 = alter >= 18 ? "Minderjähriger" : alter >= 64 ? "Senior" : "Erwachsener";
		System.out.println("Du bist " +ergebnis);
		System.out.println("Du bist " + ergebnis2);
		
		// Empfehlung: Ternärer Operatoren sollte man verschachtelt nicht nutzen, da sie die Lesbarkeit
		// in der Regel nicht fördern
		

	}

}
