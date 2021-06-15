package lt.lhu.unit05.main;

public class Task02 {

	public static void main(String[] args) {
		int a, b, c;
		a = 110;
		b = 110; 
		c = 12;
		int sum;
		int min;
		int max;
		
		min = calculateMin (a, b, c);
		System.out.println("min = " +min);
		
		max = calculateMax (a, b, c);
		System.out.println("max = " +max);
				
		sum = calculateSum (min, max);
		System.out.println("sum = " +sum);

	}
	public static int calculateMin (int x, int y, int z) {
		int resultMin;
		resultMin = 0;
		if (x <= y && x <= z) {
			resultMin = x;
			}
		else if 
			(y <= x && y <= z) {
			resultMin = y;
		}
		else if (z <= x && z <= y) {
			resultMin = z;
		}
		return resultMin;
	}
	public static int calculateMax (int x, int y, int z) {
		int resultMax;
		resultMax = 0;
		if (x >= y && x >= z) {
			resultMax = x;
			}
		else if 
			(y >= x && y >= z) {
			resultMax = y;
		}
		else if (z >= x && z >= y) {
			resultMax = z;
		}
		return resultMax;
	}
	public static int calculateSum (int k, int m) {
		int resultSum;
		resultSum = k + m;
		return resultSum;
	}

}
