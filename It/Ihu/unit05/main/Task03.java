package It.Ihu.unit05.main;

public class Task03 {

	public static void main(String[] args) {
		int a;
		int b;
		a = 341;
		b = 678;
		int countA;
		int countB;

		countA = calculateCount(a);
		// System.out.println("countA = " + countA);
		countB = calculateCount(b);
		// System.out.println("countB = " + countB);

		if (countA > countB) {
			System.out.println("Число A содержит больше цифр, чем число B.");
		} else if (countA < countB) {
			System.out.println("Число B содержит больше цифр, чем число A.");
		} else if (countA == countB) {
			System.out.println("Числа A и B содержат одинаковое количество цифр.");

		}

	}

	public static int calculateCount(int x) {
		int count;
		count = 1;

		for (; x != 0; x /= 10) {
			double z;
			z = x / 10;
			if (z > 0) {
				count++;
			}
		}

		return count;

	}

}