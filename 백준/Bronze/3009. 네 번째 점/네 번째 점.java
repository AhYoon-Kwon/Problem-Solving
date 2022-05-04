import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] x = new int[3];
		int[] y = new int[3];
		
		for (int i = 0; i < 3; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		int[] cntx = new int[1001];
		int[] cnty = new int[1001];
		for (int i = 0; i < 3; i++) {
			cntx[x[i]]++;
			cnty[y[i]]++;
		}
		
		int ans1 = 0, ans2 = 0; 
		for (int i = 0; i < 1001; i++) {
			if(cntx[i] == 1) ans1 = i;
			if(cnty[i] == 1) ans2 = i;
		}
		System.out.println(ans1 + " " + ans2);
		
		scan.close();
	}

}