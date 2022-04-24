import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] dot = new int[N][2];
		for (int i = 0; i < N; i++) {
			dot[i][0] = scan.nextInt();
			dot[i][1] = scan.nextInt();
		}
		
		Arrays.sort(dot, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				//x좌표가 같으면  y좌표가 증가하는 순
				if(o1[0] == o2[0])
					return o1[1] - o2[1];
				//그외 기본은 x좌표가 증가하는 순
				else
					return o1[0] - o2[0];
			}
		});
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dot[i][j]+ " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}