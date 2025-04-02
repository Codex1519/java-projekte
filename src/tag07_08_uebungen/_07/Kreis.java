package tag07_08_uebungen._07;

public class Kreis {
	
	private double radius;
	
	public Kreis() {
		this.radius = 0;
	}
	
	public Kreis(double radius) {
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getUmfang() {
		return 2 * Math.PI * radius;
	}
	
	public double getFlaeche() {
		return Math.PI * Math.pow(radius, 2);
	}
		
	// Ab hier Aufgabe 05 Erweitern der Kreis Klasse mit Methoden
	public void setRadiusByUmfang(double umfang) {
			setRadius(umfang / (2 * Math.PI));
		}
	
	public void setRadiusByFlaeche(double flaeche) {
		this.radius = Math.sqrt(flaeche / Math.PI);
		
 	}

}
