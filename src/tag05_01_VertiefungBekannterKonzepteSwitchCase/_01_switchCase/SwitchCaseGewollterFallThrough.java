package tag05_01_VertiefungBekannterKonzepteSwitchCase._01_switchCase;

public class SwitchCaseGewollterFallThrough {

	public static void main(String[] args) {
		int monat = 5;
		
		switch(monat) {
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3: 
		case 4:
		case 5:
			System.out.println("Frühling");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Sommer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Herbst");
			break;
		default:
			System.out.println("Ungültiger Monat.");
		}

	}

}
