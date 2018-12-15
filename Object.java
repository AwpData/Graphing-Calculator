import java.util.Scanner;

public class Point {
	private double x;
	private double y;

	public Point() {
		this.x = Point.getInputx();
		this.y = Point.getInputy();
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return ("(" + x + ", " + y + ")");
	}

	public static double getInputx() {
		System.out.println("Enter an x-coordinate: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}

	public static double getInputy() {
		System.out.println("Enter a y coordinate: ");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		return num;
	}

	public static String getDistance(double p1x, double p1y, double p2x, double p2y) {
		double xfinal = Math.pow((p2x - p1x), 2);
		double yfinal = Math.pow((p2y - p1y), 2);
		double distance = Math.sqrt(xfinal + yfinal);
		return String.format("%.2f", distance);
	}

	public static String getMidpoint(double p1x, double p1y, double p2x, double p2y) {
		double xfinal = (p1x + p2x) / 2;
		double yfinal = (p1y + p2y) / 2;
		return String.format("(%.2f,%.2f)", xfinal, yfinal);
	}
	
	public static String getSlope(double p1x, double p1y, double p2x, double p2y) {
		double yfinal = p2y - p1y;
		double xfinal = p2x - p1x;
		return String.format("(%.2f,%.2f)", yfinal, xfinal);
	}
	public static String getQuadrant(double px, double py) {
		if (px > 0 && py > 0) {
			return ("Quadrant I");
		}
		else if (px < 0 && py > 0) {
			return ("Quadrant II");
		}
		else if (px < 0 && py < 0) {
			return ("Quadrant III");
		}
		else if (px > 0 && py < 0) {
			return ("Quadrant IV");
		}
		return ("This shouldn't have happened. How did you get this error?");
	}
}
