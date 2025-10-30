package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int[] pointValues = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] ranks = new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = new String[] {"Spades","Hearts","Diamonds","Clubs"};
		Deck2 d1 = new Deck2(ranks, suits, pointValues);
		
		System.out.println(d1.deal());
		
		int[] pointValues21 = new int[] {11,2,3,4,5,6,7,8,9,10,10,10,10};
		String[] ranks21 = new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits21 = new String[] {"Spades","Hearts","Diamonds","Clubs"};
		Deck2 d2 = new Deck2(ranks21, suits21, pointValues21);
		
		
	}
}
