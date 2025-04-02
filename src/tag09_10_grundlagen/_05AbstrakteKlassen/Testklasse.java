package tag09_10_grundlagen._05AbstrakteKlassen;

public class Testklasse {

	public static void main(String[] args) {
		Auto meinAuto = new Auto ("Seat",60, 5);
		meinAuto.zeigeDetails();
		meinAuto.beschleunigen(60);
		
		System.out.println();
		
		meinAuto.zeigeDetails();
	}

}
