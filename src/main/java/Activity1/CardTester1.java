package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 n1 = new Card1("King", "Spades", 13);
		Card1 n2 = new Card1("Queen", "Spades", 12);
		Card1 n3 = new Card1("Jack", "Spades", 11);
		Card1 n4 = new Card1("Jack", "Spades", 11);
		
		System.out.println(n1.pointValue());
		System.out.println(n1.rank());
		System.out.println(n1.suit());
		
		System.out.println(n1.matches(n2));
		System.out.println(n3.matches(n4));
	}
}
