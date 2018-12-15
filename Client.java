import java.util.Scanner;

public class Coordinates {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		Scanner input = new Scanner(System.in);
		System.out.println(p1);
		System.out.println(p2);
		double p1x = p1.getX(), p1y = p1.getY();
		double p2x = p2.getX(), p2y = p2.getY();
		System.out.println("What Calculation do you want to do? (Enter the number) ");
		System.out.println("1. Distance"); // look here for options
		System.out.println("2. Midpoint");
		System.out.println("3. Quadrant");
		System.out.println("4. Slope");
		System.out.println("5. Quit");
		System.out.println();
		String choice = input.nextLine();
		while (!choice.equals("7")) {
			if (choice.equals("1")) {
				System.out.println("The distance is between " + p1 + " and " + p2 + " is "
						+ Point.getDistance(p1x, p1y, p2x, p2y));
			} else if (choice.equals("2")) {
				System.out.println(
						"The midpoint of " + p1 + " and " + p2 + " is " + Point.getMidpoint(p1x, p1y, p2x, p2y));
			} else if (choice.equals("3")) {
				System.out.println("The quadrant of " + p1 + " is " + Point.getQuadrant(p1x, p1y));
				System.out.println("The quadrant of " + p2 + " is " + Point.getQuadrant(p2x, p2y));
			} else if (choice.equals("4")) {
				System.out.println(
						"The slope between " + p1 + " and " + p2 + " is " + Point.getSlope(p1x, p1y, p2x, p2y));
			} else if (choice.equals("5")) {
				break;
			}
			System.out.println();
			System.out.println("What Calculation do you want to do?");
			choice = input.nextLine();
		}
		System.out.println("Quitting");
	}
}
