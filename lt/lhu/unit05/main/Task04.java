package lt.lhu.unit05.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {

		int k;
		k = 0;
		int m;
		m = k + 2;
		// System.out.println("k = " + k);
		// System.out.println("m = " + m);

		addition(k, m);

	}

	public static void addition(int a, int b) {
		int n;
		n = 9;
		int[] mas = new int[n];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}
		/*
		 * for (int i = 0; i < mas.length; i++) { System.out.printf("%3d", mas[i]); }
		 * System.out.println();
		 */
		int sum;
		sum = 0;
		for (int j = a; j <= b; j++) {
			sum = sum + mas[j];
		}
		System.out.println("sum = " + sum);

	}
}
