package tag06_uebungen._02_;



public class BenutzerkontoTestErweitern {

	public static void main(String[] args) {
		
		BenutzerkontoErweitern konto = new BenutzerkontoErweitern();
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
		System.out.println();
		
		konto.aendereEmail("max.muster_neu@example.com");
		
		System.out.println("\nKontovalidierung mit: max.mustermann, max.muster_neu@example.de");
		boolean validierungsergebnis1 = konto.validiereBenutzerNameUndEmail("max.mustermann", "max.muster_neu@example.com");
		System.out.println("Validierung erfolgreich: " + (validierungsergebnis1 ? "Ja" : "Nein"));
		
		System.out.println("\nKontovalidierung mit: max.mustermann2, max.muster_neu@example.de");
		boolean validierungsergebnis2 = konto.validiereBenutzerNameUndEmail("max.mustermann2", "max.muster_neu@example.com");
		System.out.println("Validierung erfolgreich: " + (validierungsergebnis2 ? "Ja" : "Nein"));
		

	}

}
