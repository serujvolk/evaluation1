package les.educ.jc.evaluation1;

public class Task5 {

	public static void main(String[] args) {
		int n = 20;
		double a = 1;
		double x1 = -2 * a;
		double dX = a / 5;

		double[][] res = new double[2][n];

		for (int i = 0; i < n; i++) {
			res[0][i] = x1;
			res[1][i] = f(a, x1);

			x1 += dX;
		}

		print(res);

	}

	public static double f(double a, double x) {
		double y;

		if (a == 0 && x <= 0) {
			System.out.println("Решение не возможно, знаменатель дроби равен 0.");
			return 0;
		}

		if ((x * x + 4 * a * a) == 0 && x > 0) {
			System.out.println("Решение не возможно, знаменатель дроби равен 0.");
			return 0;
		}

		if (x <= 0) {
			y = a / 2 * (Math.exp(x / a) + Math.exp(-x / a));
		} else {
			y = 4 * Math.pow(a, 3) * (x * x + 4 * a * a);
		}

		return y;
	}

	public static void print(double[][] mas) {

		System.out.printf("\n%-4s%-12s%-12s", "№", "x", "f(x)", "\n");
		for (int j = 0; j < mas[0].length; j++) {
			System.out.printf("\n%-4s%-12.6f%-12.6f", String.valueOf(j + 1) + ")", mas[0][j], mas[1][j]);
		}

	}

}
