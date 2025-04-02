package tag06_uebungen._03_;

public class ProfilTest {

	public static void main(String[] args) {
		
		BenutzerkontoErweiternMitProfil konto = new BenutzerkontoErweiternMitProfil();
		konto.benutzername = "max.mustermann";
		konto.email = "max.mustermann@example.com";
		konto.aktiv = true;
		
		Profil profil = new Profil();
		profil.vorname = "Max";
		profil.nachname = "Mustermann";
		profil.geburtsDatum = "01.01.1990";
		
		konto.zeigeStatus();
		
		System.out.println();
		
		konto.speichereProfil(profil);
		
		konto.zeigeStatus();
		
		

	}

}
