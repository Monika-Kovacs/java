/* Boolean to determine whether a word is abecedarian, ie whether all the letters are in
 * alphabetical order.
 * Using arrays to convert letters into their unicode in order to compare them (whether in 
 * ascending order)
 */


public class Abecedarian {
	
	public static boolean isAbecedarian(String word) { 
		
		// will need word length later for size of array and for loops
		int size = word.length();
		// new array for unicode numbers, set size
		int[] uniNumber = new int [size];
		
		// for  loop to create converted array
		for (int i = 0; i < size; i++) {
			
			uniNumber[i] += (int)word.charAt(i); 
		}	
		// for loop to check whether numbers are in ascending order
		for (int j = 0; j < size-1; j++) {

			if (uniNumber[j] >= uniNumber[j+1]) {
					
				System.out.println(word.charAt(j)+" and "+word.charAt(j+1));
				System.out.println("letters in "+ word+ " are not in alphabetical order");
				return false;
			
			}	
		}
		// return true if they are in ascending order
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isAbecedarian("zxyabcklllmno"));
	}

}


