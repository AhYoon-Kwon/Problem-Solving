import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		String result = fact(N).toString();
		int ans = 0;
		for (int i = result.length()-1; i > 0; i--) {
			if(result.charAt(i) == '0') ans++;
			else break;
		}
		System.out.println(ans);
		
		scan.close();
	}
	
	static BigInteger fact(int n) {
		BigInteger res = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}

}