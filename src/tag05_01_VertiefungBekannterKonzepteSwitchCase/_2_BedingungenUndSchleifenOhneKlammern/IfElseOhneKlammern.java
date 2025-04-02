package tag05_01_VertiefungBekannterKonzepteSwitchCase._2_BedingungenUndSchleifenOhneKlammern;

public class IfElseOhneKlammern {

	public static void main(String[] args) {
		
		int alter = 20;
		
		if(alter >= 18) {
			System.out.println("Du bist volljährig.");
		}else {
			System.out.println("Du bist minderjährig.");
		}
		
		if(alter >= 18) System.out.println("Du bist volljährig.");
		else System.out.println("Du bist minderjährig.");
		
		// Weglassen von Klammern sollte sparsam eingesetzt, da es potentiell die Lesbarkeit verschlechtern
		// kann
		
	}

}
