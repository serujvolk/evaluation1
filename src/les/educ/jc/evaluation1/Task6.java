package les.educ.jc.evaluation1;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		double a = 3000;
		double b = 60000;
		double m = 4;

		int[] k = new int[20];

		generateKRandom(k);

		f(k, a, b, m);
	}

	public static void f(int k[], double a, double b, double m) {
		int notOfCount = 0;
		long fk;
		for (int i = 0; i < k.length; i++) {
			fk = (long) (Math.pow(k[i], 3) - 25 * Math.pow(k[i], 2) + 50 * k[i] + 1000);

			if (checkForConditions(a, b, m, fk)) {
				System.out.println(fk);
			} else {
				notOfCount++;
			}
		}

		System.out.println("Количество неудовлетворяющих элементов: " + notOfCount);
	}

	public static void generateKRandom(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(90) - 30;

		}
	}

	public static boolean checkForConditions(double a, double b, double m, long fk) {
		double t1 = Math.sqrt(a + b + m);
		double t2 = m * Math.sqrt(a + b);
		double t3 = Math.sqrt(a * b * m);
		double t4 = m * Math.sqrt(a * b);

		return (fk > t1 && fk < t2) || (fk > t3 && fk < t4);
	}

}