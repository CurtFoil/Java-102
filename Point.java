public class Point {
	public final double x;
	public final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point translateX(double t) {
		return new Point(x + t, y);
	}
	
	public Point translateY(double t) {
		return new Point(x, y + t);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	public static Point centerOMass(Point[] points){
		double addx = 0;
		double addy = 0;

		for (Point point : points) {
			addx += point.x;
			addy += point.y;
		}

		double centerx = addx / points.length;
		double centery = addy / points.length;

		return new Point(centerx, centery);
	}

	public double angle{
		private double x;
		private double y;


	}

}