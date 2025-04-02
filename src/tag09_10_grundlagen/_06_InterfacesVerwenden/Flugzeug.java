package tag09_10_grundlagen._06_InterfacesVerwenden;

public class Flugzeug extends Fahrzeug implements KannBeschleunigen {
	int geschwindigkeit = 0;
	double tankgroesse;
	
	public Flugzeug() {
		geschwindigkeit = 0;
		tankgroesse = 200_000;
	}
	
	public Flugzeug(int geschwindigkeit, double tankgroesse) {
		this.tankgroesse = tankgroesse;
	}
	
	public void zeigeDetails() {
		System.out.println("Ich bin ein Flugzeug." 
				+ "\n Geschwindigkeit: " + this.geschwindigkeit + "km/h"
				+ "\nTankgroesse: " + this.tankgroesse);
	}

	@Override
	public void beschleunigen(int zusatzGeschwindigkeit) {
		geschwindigkeit += zusatzGeschwindigkeit;
		System.out.println("Beschlenigung eines Autos auf " + geschwindigkeit + " km/h");
		
	}

}
