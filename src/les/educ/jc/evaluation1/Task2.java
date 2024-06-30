package les.educ.jc.evaluation1;

public class Task2 {

	public static void main(String[] args) {
		double a = 0.5, b = 1.0;
		int n = 10;
		double[][] mas0 = new double[2][n];

		double step = (b - a) / (n - 1);

		for (int i = 0; i < n; i++) {
			double x = a + i * step;
			mas0[0][i] = x;
			mas0[1][i] = f(x);
		}

		print(mas0);

	}

	public static double f(double x) {
		double y;

		if (x + 2.0 / 3 == 0) {
			System.out.println("Решение не возможно, знаменатель дроби равен 0.");
			return 0;
		}

		y = Math.sqrt(Math.exp(2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2.0 / 3))) + 1.7;

		return y;
	}

	public static void print(double[][] mas) {

		System.out.printf("\n%-4s%-12s%-12s", "№", "x", "f(x)", "\n");
		for (int j = 0; j < mas[0].length; j++) {
			System.out.printf("\n%-4s%-12.6f%-12.6f", String.valueOf(j + 1) + ")", mas[0][j], mas[1][j]);
		}

	}

}