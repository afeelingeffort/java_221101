class MyMath {
	public static double PI = 3.1415927;
	public static double E = 2.718281;

	private MyMath() {
	}

	static public int min(int... params) {
		int minVal = 0;

		for (int i : params) {
			minVal = i < minVal ? i : minVal;
		}

		return minVal;
	}

	static public double min(double... params) {
		double minVal = 0;

		for (double i : params) {
			minVal = i < minVal ? i : minVal;
		}

		return minVal;
	}

	static public int max(int... params) {
		int maxVal = 0;

		for (int i : params) {
			maxVal = i > maxVal ? i : maxVal;
		}

		return maxVal;
	}

	static public double max(double... params) {
		double maxVal = 0;

		for (double i : params) {
			maxVal = i > maxVal ? i : maxVal;
		}

		return maxVal;
	}

	static public int abs(int i) {
		return i > 0 ? i : -i;
	}

	static public double abs(double d) {
		return d > 0 ? d : -d;
	}

	static public double floor(double d) {
		return d >= 0 ? d - (d % 1) : d - (1 + d % 1);
	}

	static public double ceil(double d) {
		return d > 0 ? d + (1 - (d % 1)) : d - (d % 1);
	}
}

public class google_oop_method_MyMath {

	public static void main(String[] args) {
		System.out.println(MyMath.PI);
		System.out.println(MyMath.E);
		System.out.println(MyMath.min(2, 3, 4, 5, 6, -4, 3.3, 7.5, -5.6));
		System.out.println(MyMath.max(2, 3, 4, 5, 6, -4, 3.3, 7.5, -5.6));
		System.out.println(MyMath.abs(4));
		System.out.println(MyMath.abs(-2.3));
		System.out.println(MyMath.floor(0));
		System.out.println(MyMath.ceil(-3.141592));
		
	}

}
