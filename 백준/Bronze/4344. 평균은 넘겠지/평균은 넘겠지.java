import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int C = scan.nextInt(); //테케
		for (int i = 0; i < C; i++) {
			int N = scan.nextInt(); //학생의 수
			int[] score = new int[N];
			double sum = 0;
			
			for (int j = 0; j < N; j++) {
				score[j] = scan.nextInt();
				sum += score[j];
			}
			double avg = sum / N;
			
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				if(score[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%", ((cnt*1.0)/N)*100);
			System.out.println();
		}
		
		scan.close();
	}

}