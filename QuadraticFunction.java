/* Solve quadratic function ax^2 + bx + c = 0 in the form of (-b +/- sqrt(b^2 - 4ac))/2a
 * Method 'quadraticX': single array creation was necessary as (-b / 2 * a +/-) needs to be 
 * evaluated separately.  
 */
import java.util.Scanner;

public class QuadraticFunction {
	
	public static double[] quadraticX(double a, double b, double c) {
		
		// Need to create a way to re-enter 'a' if needed as division by zero is
		// not permitted.
		Scanner newValue = new Scanner (System.in);
		
		// while loop to force non 0.0 parameter
		while (a == 0) {
			System.out.println("No division by zero, please re-enter 'a'");
			a = newValue.nextDouble();
		}
		
		// negative value under square root cannot be calculated
		if ((Math.pow(b, 2) - 4 * a * c) < 0) {
			System.out.println("Can't take square root of a negative number");
		}
		
		//initialise array to create the two elements x1 and x2
		double [] quad = new double [2];
		
		quad[0] = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		quad[1] = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

		return quad;

	}
	
	public static void main(String[] args) {
		
		// parameter values for quadratic function solution, initialised variable is 
		// necessary to create a copy of the arrayy so that conditions and loops in
		// method are not run more than once.
		double[] x = quadraticX(-0.5, -2.0, 1.0);
		
		// iterate over the single array
		for (int i=0; i < 2; i++) {
		
			System.out.println(x[i]);
		}
	
	}
}
