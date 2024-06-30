package les.educ.jc.evaluation1;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int n = 10;
		int[][] pixels = new int[2][n];

		generatePixelRandom(pixels);
		printPixelArray(pixels);
		System.out.println("\nКоличество точек внутри области:" + borders(pixels));

	}

	public static void generatePixelRandom(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas[0].length; i++) {
			mas[0][i] = rand.nextInt(8) - 4;
			mas[1][i] = rand.nextInt(8) - 4;
		}
	}

	public static int borders(int [][] mas) {
		int count = 0;
		for (int j = 0; j < mas[0].length; j++) {
			if (isInArea(mas[0][j], mas[1][j])) {
				count++;
			}
		}

		return count;
	}

	public static boolean isInArea(int x, int y) {
		boolean result;

		result = ((x >= 0 && x <= 2 && y >= -1 && y <= 1) || (x >= -2 && x <= 0 && y >= 0 && y <= 2));

		return result;
	}

	public static void printPixelArray(int[][] mas) {

		for (int i = 0; i < mas[0].length; i++) {
			System.out.print("( " + mas[0][i] + " ; " + mas[1][i] + " ) ");
		}

	}

}
