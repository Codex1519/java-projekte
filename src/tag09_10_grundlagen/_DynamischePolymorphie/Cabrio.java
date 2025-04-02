package tag09_10_grundlagen._DynamischePolymorphie;

public class Cabrio extends Auto{
	
	public void verdeckeOeffnen() {
		System.out.println("Das Verdeck wird geöffnet.");
	}
	
	@Override
	public void fahren() {
		System.out.println("Das Cabrio fährt vielleicht mit offenem Verdeck!");
	}

}
