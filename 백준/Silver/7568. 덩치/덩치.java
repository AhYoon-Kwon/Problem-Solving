import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] stu = new int[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				stu[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			int w = stu[i][0];
			int h = stu[i][1];
			int bigger = 1;
			
			for (int j = 0; j < N; j++) {
				//나보다 덩치큰게 몇명인지
				if(w < stu[j][0] && h < stu[j][1]) {
					bigger++;
				}
			}
			
			System.out.print(bigger+ " ");
		}
		System.out.println();
		
		scan.close();
	}

}