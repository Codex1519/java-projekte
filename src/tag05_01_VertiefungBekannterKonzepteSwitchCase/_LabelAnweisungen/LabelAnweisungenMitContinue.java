package tag05_01_VertiefungBekannterKonzepteSwitchCase._LabelAnweisungen;

public class LabelAnweisungenMitContinue {
	// Labels werden sparsam eingesetzt, da der Code schwerer lesbar und wartbar dadurch wird

	public static void main(String[] args) {
		aeußereSchleife:
		for(int i = 0; i < 3; i++) {
				for(int j = 0; j <3; j++) {
					if(i == j) {
						continue aeußereSchleife;  
					}
					System.out.println("i: " + i + ", j: " + j);
				}
		}

	}

}
