/* find square root of a through guessing and incrementally getting clos
 * loops between first guess(x0) and improved guess (x1) to keep getting closer to 
 * square root. "improvedGuess" is final answer once the difference between two consecutive
 * guesses is less than delta. Initial guess = a/2; x1 = (x0 + a/x0) / 2;
 * 
 */
public class SquareRoot {

	public static double sqrt(double a) {
		
		double delta = 0.0001;
		double guess = a / 2;
		double improvedGuess = (guess + a/guess) / 2;
		
		while (Math.abs(improvedGuess - guess) > delta) {
			
			guess = improvedGuess;
			improvedGuess = (guess + a / guess) / 2;
		}
		
		return improvedGuess;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sqrt(25));
	
	
		}

}
