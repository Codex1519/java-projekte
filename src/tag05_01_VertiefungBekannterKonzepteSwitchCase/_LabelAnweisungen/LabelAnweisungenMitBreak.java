package tag05_01_VertiefungBekannterKonzepteSwitchCase._LabelAnweisungen;

public class LabelAnweisungenMitBreak {

	public static void main(String[] args) {
		// Labels sind Bezeichner, die vor Statements, also Schleifen oder Blöcken stehen
		// Werden genutzt um den Kontrollfluss gezielt zu steuern
		// Werden in Kombination mit break und continue verwendet
		
		aeußereSchleife:
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.println("i:" + i + ", j: " + j);
					if(i == 2 && j == 2) {
						break aeußereSchleife;
					}
				}
			}
	}
}
	

/*
 * i: 0, j: 0
 * i: 0, j: 1
 * i: 0, j: 2
 * i: 1, j: 0
 * i: 1, j: 1
 * i: 1, j: 2
 * i: 2, j: 0
 * i: 2, j: 1
 * i: 2, j: 2
 */
