package h3;

public class H3_main {
	public static void main(String[] args) {
		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		int input = 150000;
		int temp = input;

		for (int i = 0; i < 15; i++) {
			while (temp >= einheiten[0][i]) {
				einheiten[1][i]++;
				temp = temp - einheiten[0][i];
			}
		}

		for (int i = 0; i < einheiten.length; i++) {
			for (int j = 0; j < einheiten[0].length; j++) {

				System.out.print(einheiten[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
