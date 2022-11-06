class Point {
	int x;
	int y;

	Point(int _x, int _y) {
		x = _x;
		y = _y;
	}

	String toStr() {
		return String.format("(%d, %d)", x, y);
	}

	static double distance(Point p, Point q) {
		double dX = p.x - q.x;
		double dY = p.y - q.y;
		return Math.sqrt((dX * dX) + (dY * dY));
	}
}

public class google_oop_method_Point {

	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);

		double dist = Point.distance(p1, p2);

		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
	}

}
