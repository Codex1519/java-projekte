package tag09_10_uebungen._05;

public class Anteil extends Bruch{
	private static Bruch verteilt = new Bruch();
	
	public Anteil() {
		super();
	}
	
	public Anteil(int zaehler, int nenner) {
		super(zaehler,nenner);
		verteilt = verteilt.addiere(this);
		if(this.getVerteilt() > 1) {
			System.out.println("Zu viel verteilt ! Nix mehr übrig.");
		}
	}
	
	public double getVerteilt() {
		return verteilt.dezimalwert();
	}
	
	public static Bruch getVerteiltAlsBruch() {
		return verteilt;
	}
	
	public static Bruch getRest() {
		Bruch gesamterBruch = new Bruch(1);
		return gesamterBruch.subtrahiere(verteilt);
	}
}
