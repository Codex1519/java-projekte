package tag05_01_VertiefungBekannterKonzepteSwitchCase._01_switchCase;

public class SwitchCaseMitFehlendenBreak {

	public static void main(String[] args) {
		int tag = 1; // Annahme: Die Tag Variable steht für einen Wochentag
		
		switch(tag) {
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
		case 3:
			System.out.println("Mittwoch");
			break;
		default:
			System.out.println("Wochenende");
		}
		
		

	}

}
