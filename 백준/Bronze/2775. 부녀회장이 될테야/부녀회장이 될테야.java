import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] apt = new int[15][15];
		for (int i = 0; i < 15; i++) {
			apt[0][i] = i;
		}
		for (int a = 1; a < 15; a++) {
			for (int b = 1; b < 15; b++) {
				// (a-1)층의 1~b호
				int sum = 0;
				for (int i = 1; i <= b; i++) {
					sum += apt[a-1][i];					
				}
				apt[a][b] = sum;
			}
		}

		int T = scan.nextInt(); // tc
		for (int i = 0; i < T; i++) {
			int k = scan.nextInt(); // k층
			int n = scan.nextInt(); // n호

			System.out.println(apt[k][n]);
		}

		scan.close();
	}

}