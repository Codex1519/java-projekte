package tag06_grundlagen._01_Klassen._02_Referenzvariablen;

public class App {
	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.marke = "Seat";
		meinAuto.anzahlTueren = 5;
		meinAuto.meinMotor.leistung = 170;

		meinAuto.zeigeDetails();
		
		Auto meinAuto2 = new Auto();
		meinAuto2.marke = "BMW";
		meinAuto2.anzahlTueren = 3;
		meinAuto2.meinMotor.leistung = 250;
		
		System.out.println(meinAuto2);
		
		meinAuto2.zeigeDetails();
	}
}
