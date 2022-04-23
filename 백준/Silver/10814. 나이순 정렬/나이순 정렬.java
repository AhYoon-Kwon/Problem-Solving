import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[][] stu = new String[N][2];
		
		for (int i = 0; i < N; i++) {
			stu[i][0] = scan.next();
			stu[i][1] = scan.next();
		}
		
		Arrays.sort(stu, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(stu[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}