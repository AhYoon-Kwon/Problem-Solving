import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //과목개수
		double[] score = new double[N]; //성적
		double max = 0;
		for (int i = 0; i < N; i++) {
			score[i] = scan.nextInt();
			max = Math.max(max, score[i]);
		}
		
		double sum = 0;
		for (int i = 0; i < N; i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
		}
		System.out.println(sum / N);
		
		scan.close();
	}

}