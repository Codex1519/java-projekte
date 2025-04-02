package tag06_uebungen._01_;

public class BenutzerkontoTest {

	public static void main(String[] args) {
		
		Benutzerkonto konto = new Benutzerkonto();
		konto.benutzername = "max.mustermann";
		konto.email = "max.mustermann@example.com";
		konto.aktiv = false;
		
		konto.zeigeStatus();
		System.out.println();
		
		konto.kontoAktivieren();
		konto.zeigeStatus();
		System.out.println();
		
		konto.kontoDeaktivieren();
		konto.zeigeStatus();
		

	}

}
