package tag09_10_grundlagen._06_InterfacesVerwenden;

public class InterfaceTest {

	public static void main(String[] args) {
		Auto auto = new Auto("Audi", 0, 5);
		Flugzeug flugzeug = new Flugzeug(0, 180_000);
		
		auto.zeigeDetails();
		flugzeug.zeigeDetails();
		
		System.out.println();
		
		auto.beschleunigen(100);
		flugzeug.beschleunigen(300);
		
		System.out.println();
		
		auto.zeigeDetails();
		
		
		
		
		
		
	}

}
