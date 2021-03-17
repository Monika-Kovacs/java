/* Two different ways (one commented out) to create boolean argument to determine 
 * whether a particular digit is single or not. No need for 'if/else' statement.
 */

public class IsSingle {
	
	public static boolean isSingle(int digit) {
		
		//return digit > 0 && digit < 10;
		return digit / 10 == 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isSingle(8));
		
	}
}
