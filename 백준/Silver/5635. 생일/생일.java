import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[][] stu = new String[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				stu[i][j] = scan.next();
			}
		}

		Arrays.sort(stu, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if (o1[3].equals(o2[3])) {
					
					if (o1[2].equals(o2[2])) {
						return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
					}
					else return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
				}
				else return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
			}
		});
		
		//제일 나이 적은, 나이 많은 순
		System.out.println(stu[n-1][0] + "\n" + stu[0][0]);

		scan.close();
	}

}