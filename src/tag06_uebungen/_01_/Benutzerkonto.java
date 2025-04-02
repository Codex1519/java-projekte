package tag06_uebungen._01_;

public class Benutzerkonto {
	
	String benutzername;
	String email;
	boolean aktiv;
	
	void kontoAktivieren() {
		aktiv = true;
		System.out.println("Benutzerkonto wurde aktiviert.");
	}
	void kontoDeaktivieren() {
		aktiv = false;
		System.out.println("Benutzerkonto wurde deaktiviert.");
	}
	
	 void zeigeStatus() {
		System.out.println("Benutzername: " + benutzername);
		System.out.println("E-Mail-Adresse: " + email);
		System.out.println("Konto aktiv " + (aktiv ? "Ja" : "Nein"));
		
	}

}
