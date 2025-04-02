package tag02_03_04_kontrollstrukturen._bedingungen;

public class _02_ifElseMitLogischenOperatoren {

	public static void main(String[] args) {
		
		double temperatur = 34.5;
		boolean istVIP = true;
		boolean hatTicket = false;
		
		if(temperatur < 30 && temperatur > 15) {
			System.out.println("Die Temperatur ist angenehm");
		} else if (temperatur > 30) {
			System.out.println("Die Temperatur ist heiß");
		} else {
			System.out.println("Die Temperatur ist kalt");
		}
		
		// Beispiel || - ODER(OR)
		if(istVIP || hatTicket) {
			System.out.println("Du darfst eintreten");
		}else {
			System.out.println("Du darfst nicht eintreten");
		}
	}
}
