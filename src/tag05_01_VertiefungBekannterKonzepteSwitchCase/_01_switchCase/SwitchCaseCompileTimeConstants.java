package tag05_01_VertiefungBekannterKonzepteSwitchCase._01_switchCase;

public class SwitchCaseCompileTimeConstants {

	public static void main(String[] args) {
		// Eine compile-time-constant ist eine Konstante, die zur Kompilierzeit bekannt ist
		// Literale, ob ganzzahlig, chars, Strings oder Enums sind per Definition compile-time-constant
		// da sie direkt im Quellcode stehen
		// Als case - Fälle können wir Konstanten verwenden, die zur Kompilierzeit bekannt sind
		// Damit eine Variable als "compile-time-constant" gilt, muss sie in einer Anweisung deklariert
		// und initialisiert werden
		
		final int MONTAG = 1;
		final int DIENSTAG = 2;
		
		int tag = 3;
		
		switch(tag) {
		case MONTAG:
			System.out.println("Es ist Montag.");
			break;
		case DIENSTAG:
			System.out.println("Es ist Dienstag");
			break;
		default:
			System.out.println("Unbekannter Tag.");
		}
	}
}
