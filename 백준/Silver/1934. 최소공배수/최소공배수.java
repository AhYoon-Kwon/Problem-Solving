import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			int max = Math.max(A, B);
			int min = Math.min(A, B);
			
			int gcd = euc(max, min);
			int lcm = (A*B) / gcd;
			System.out.println(lcm);
		}
		
		scan.close();
	}
	
	//유클리드 호제법 -> 최대공약수
	static int euc(int big, int small) {
		
		int mod = big % small;
		
		if(mod==0) return small;
		else return euc(small, mod);
	}

}