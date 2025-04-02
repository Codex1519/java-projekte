package tag06_grundlagen._03_Objekte._01_ObjekteLebensdauer;

public class App {

	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		Auto meinAuto2 = meinAuto;
		
		meinAuto.marke = "Seat";
		meinAuto2.ps = 170;
		
		System.out.println(meinAuto.zeigeDetails());
		
		System.out.println(meinAuto2.zeigeDetails());
		
		meinAuto = null;
		
		System.out.println(meinAuto2.zeigeDetails());
		
		System.out.println()
		
		meinAuto = new Auto();
		
		meinAuto.marke = "BMW";
		meinAuto.ps = 250;
		
		System.out.println(meinAuto.zeigeDetails());
		
		meinAuto2 = null;
		System.out.println(meinAuto2.zeigeDetails()); // funktioniert nicht,
		//weil meinAuto2 nicht mehr auf ein Objekt, NullPointerException wird geworfen
		
		
		
	}
}
