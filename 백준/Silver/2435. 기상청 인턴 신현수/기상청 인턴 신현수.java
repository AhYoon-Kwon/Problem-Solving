import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] temp = new int[N];
		for (int i = 0; i < N; i++) {
			temp[i] = scan.nextInt();
		}
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N-K+1; i++) {
			sum = 0;
			for (int j = i; j < i+K; j++) {
				sum += temp[j];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
		
		scan.close();
	}

}