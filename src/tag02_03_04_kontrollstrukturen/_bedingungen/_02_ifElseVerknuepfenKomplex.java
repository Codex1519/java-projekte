package tag02_03_04_kontrollstrukturen._bedingungen;

public class _02_ifElseVerknuepfenKomplex {

	public static void main(String[] args) {
		boolean istAngemeldet = true;
		boolean istAdministrator = false;
		boolean hatMitgliedschaft = true;
		boolean istMitgliedschaftGueltig = false;
		
		if(istAngemeldet && (istAdministrator || (hatMitgliedschaft && istMitgliedschaftGueltig))) {
			System.out.println("Zugriff gewährt");
		} else {
			System.out.println("Zugriff verweigert");
		}
	}
}
