package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {
		int n = 3863;
		int digits = String.valueOf(n).length();
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int temp = n;
		int index = 8;

		if (n == 0) {
			a[8] = 0;
		} else {
			while (temp > 0) {
				a[index] = temp % 10;
				temp /= 10;
				index--;
			}
		}
		System.out.println(digits);
		System.out.println(Arrays.toString(a));

	}
}
