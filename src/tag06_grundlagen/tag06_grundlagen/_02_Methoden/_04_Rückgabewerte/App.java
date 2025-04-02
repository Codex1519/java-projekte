package tag06_grundlagen._02_Methoden._04_Rückgabewerte;

public class App {
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.setzeDetails("Audi", 180);
		
		System.out.println("Details über Auto 1:");
		System.out.println(meinAuto.zeigeDetails());
		
		
		Auto meinAuto2 = new Auto();
		meinAuto2.setzeDetails("Skoda", 80);

		System.out.println("Details über Auto 2:");
		System.out.println(meinAuto2.zeigeDetails());
	}
}
