import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int p = scan.nextInt();
			String[][] input = new String[p][2];
			for (int j = 0; j < p; j++) {
				input[j][0] = scan.next();
				input[j][1] = scan.next();
			}
			
			Arrays.sort(input, new Comparator<String[]>() {
				@Override
				public int compare(String[] o1, String[] o2) {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
			});
			
			System.out.println(input[p-1][1]);
		}
		
		scan.close();
	}

}