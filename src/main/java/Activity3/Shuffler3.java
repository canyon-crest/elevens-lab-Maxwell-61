package Activity3;

import java.util.Arrays;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler3 {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int middle = values.length/2;
		int[] left = new int[middle];
		int[] right = new int[values.length - middle];
		
		for(int i=0; i<middle; i++) {
			left[i] = right[i];
		}
		for(int i=0; i<(values.length - middle); i++) {
			right[i] = values[middle + i];
		}
		
		for(int i=0, j=0; i<values.length; i += 2, j++) {
			values[i] = left[j];
		}
		for(int i=1, j=0; i<values.length; i += 2, j++) {
			values[i] = right[j];
		}
		
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for(int i = 0; i<values.length; i++) {
			int random = (int) (Math.random() * values.length);
			int temp = values[i];
			values[i] = values[random];
			values[random] = values[temp];
		}
	}
	
	public static String flip() {
		int random = (int) (Math.random() * 3);
		if(random == 0) {
			return "tails";
		}
		else {
			return "heads";
		}
	}
	
	public static boolean arePermutations(Object[] obj1, Object[] obj2) {
		if(obj1.length != obj2.length){
			return false;
		}
		
		Arrays.sort(obj1);
		Arrays.sort(obj2);
		
		for(int i=0; i<obj1.length; i++) {
			if(obj1[i].equals(obj2[i])) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
}

