package tag09_10_grundlagen._DynamischePolymorphie;

public class Testklasse {

	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		Auto meinCabrio = new Cabrio();
		
		meinAuto.fahren();
		
		System.out.println();
		
		meinCabrio.fahren();
	
	}
}
