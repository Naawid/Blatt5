package h1;

import java.util.Arrays;

public class H1_main {
	public static void main(String[] args) {
		int[] myArray = {5,6,7,10,11};
		int[] arrayKopie = myArray.clone();
		int b = myArray.length;
		
		
		for (int i = 0; i < b; i++) {
			myArray[i] = arrayKopie[b-1-i];
		}
		System.out.println(Arrays.toString(myArray));
	}
}
