package tag06_uebungen._03_;

public class BenutzerkontoErweiternMitProfil {
	
	public String benutzername;
	public String email;
	boolean aktiv;
	Profil profil = null;
	
	void kontoAktivieren() {
		aktiv = true;
		System.out.println("Benutzerkonto wurde aktiviert.");
	}
	void kontoDeaktivieren() {
		aktiv = false;
		System.out.println("Benutzerkonto wurde deaktiviert.");
	}
	void aendereEmail(String neueEmail) {
		email = neueEmail;
		System.out.println("Die E-Mail-Adresse wurde erfolgreich geändert zu: " +email);
	}
	boolean validiereBenutzerNameUndEmail(String benutzername, String email) {
		return this.benutzername.equals(benutzername) && this.email.equals(email);
	}
	
	void zeigeStatus() {
		System.out.println("Benutzername: " + benutzername);
		System.out.println("E-Mail-Adresse: " + email);
		System.out.println("Konto aktiv: " + (aktiv ? "Ja" : "Nein"));
		if(profil != null) {
			profil.zeigeProfil();
		}else {
			System.out.println("Kein Profil vorhanden.");
		}
		
	}
	void speichereProfil(Profil profil) {
		this.profil = profil;
		System.out.println("Profil wurde im Benutzerkonto gespeichert.");
	}


}
