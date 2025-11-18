package h2;

import java.util.Arrays;

public class H2_main {
	public static void main(String[] args) {
		int n = 20;
		int digits = 500;
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int b = 1;
		int r;

		for (int i = 1; i < 1000000000; i = i * 10) {
			if (n - i >= 0) {
				digits = b;
			}
			b++;
		}
		if(digits==1) {
		for (int i = 0; i<=9; i++) {
			if(n - i == 0) {
				a[8]= i;
			}
		}
		}
		if(digits==2) {
			for (int i = 10; i<=90; i++) {
				if(n - i == 0) {
					a[7]= i;
				}
			}
			}
		
		
		
		
		/* for (int i = digits - 1; i <= digits && i >= 0; i--) {
			a[i] = 4;
		}*/

		System.out.println(digits);
		System.out.println(Arrays.toString(a));

	}
}
