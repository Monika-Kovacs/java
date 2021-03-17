/*Calculate area of cylinder A = 2 * pi * radius * height + 2 * pi * radius ^2
 * 
 */


public class CylinderArea {
	// method for cylinder area calculation in general
	public static double cylinderCalculation(double radius, double height) {
		
		return 2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius);
	}
	// radius = diameter / 2
	public static void main (String[] args) {
		
		double diameter = 10.0;
		double height = 30.0;
		
		System.out.println(cylinderCalculation(diameter/2, height));

	}
}
