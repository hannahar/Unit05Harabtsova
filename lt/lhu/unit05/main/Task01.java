package lt.lhu.unit05.main;

public class Task01 {
	public static void main(String[] args) {

		{
			int a;
			a = 12;
			int b = 8;
			int countA;
			countA = 0;
			int countB;
			countB = 0;

			countA = calculation(a, countA);

			int[] mas = new int[countA];

			for (int j = 0; j < mas.length; j++) {
				for (int i = 1; i <= a; i++) {

					if (a % i == 0) {
						mas[j] = a / i;
						j++;
					}
				}
			}

			countB = calculation(b, countB);

			int[] mas2 = new int[countB];

			for (int j = 0; j < mas2.length; j++) {
				for (int i = 1; i <= b; i++) {

					if (b % i == 0) {
						mas2[j] = b / i;
						j++;

					}
				}
			}

			int n;
			n = 0;

			for (int k = 0; k < mas.length; k++) {
				for (int m = 0; m < mas2.length; m++) {
					if (mas[k] == mas2[m]) {
						n++;
					}
				}
			}
			// System.out.println("n = " + n);
			int[] array = new int[n];
			for (int i = 0; i < n;) {
				for (int k = 0; k < mas.length; k++) {
					for (int m = 0; m < mas2.length; m++) {
						if (mas[k] == mas2[m]) {
							array[i] = mas[k];
							i++;
						}
					}
				}
			}

			int nod;
			nod = array[0];
			System.out.println("nod = " + nod);

			int nok;
			nok = calculationNok(a, b, nod);

			System.out.println("nok= " + nok);
		}

	}

	public static int calculation(int x, int count) {

		for (int i = 1; i <= x; i++) {

			if (x % i == 0) {
				count++;
			}
		}

		return count;
	}

	public static int calculationNok(int x, int y, int z) {
		int result;
		result = 0;
		result = (x * y) / z;

		return result;
	}
}
