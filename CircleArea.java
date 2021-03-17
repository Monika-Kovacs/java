/* Calculate the area of a circle, using 2 methods main and CalculateArea()
 * CalculateArea() method contains the calculation formula - or algorithm, in this context
 * 
 */

public class CircleArea {
	// method to calculate area of circle. 
	public static double CalculateArea(double radius) {
		
		return Math.PI * radius * radius;
	}
	// radius = diameter / 2
	public static void main(String[] args) {
		
		double diameter = 10.0;
		//CalculateArea(diameter / 2);
		System.out.println(CalculateArea(diameter/2));

	}
}
