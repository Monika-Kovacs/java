/* Checks whether a character appears in a string exactly twice
 * 
 */


public class DoubloonTest {
	
	public static boolean isDoubloon(String stringOne) {
		
		// Array to account for every letter in the roman alphabet. This is collect relevant
		// character count
		int[] counts = new int[26];
		
		// Turn string lower case.
		String lower = stringOne.toLowerCase();
		
		// enhanced loop, iterate through every element in the string array.
		for (char letter: lower.toCharArray()) {
			
			// denote every letter in the alphabet with an integer equivalent, 'a' is 0, 'b' is 1, etc 
			int index = letter - 'a';
			// array counts the number of times a letter in the alphabet appears in string
			counts[index]++;
		}
		
		// Validate whether each character has been counted twice.
		for (int count : counts) {
			// if character doesn't appear 0 or twice, it is not a doubloon
			if (count != 0 && count != 2) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isDoubloon("BeRibErI"));
	}
	
}	
	