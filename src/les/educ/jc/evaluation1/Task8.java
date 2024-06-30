package les.educ.jc.evaluation1;

public class Task8 {

	public static void main(String[] args) {
		double x = 0.1;
		double dx = 0.1;

		while ((x <= 10) && (f(x) >= 0)) {
			System.out.printf("f(%.1f) = %.4f\n", x, f(x));
			x += dx;
		}
	}

	public static double f(double x) {
		return x * x - Math.exp(2 * x) + 4;
	}

}