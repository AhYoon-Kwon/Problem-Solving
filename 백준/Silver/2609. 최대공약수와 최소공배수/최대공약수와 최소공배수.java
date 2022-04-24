import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int gcd = euc(Math.max(a, b), Math.min(a, b));
		int lcm = (a*b) / gcd;
		
		System.out.println(gcd + "\n" + lcm);
		
		scan.close();
	}
	
	static int euc(int big, int small) {
	//유클리드 호제법 : 작은수로 큰수를 나눈 나머지가 0이 될 때의 수가 최대공약수
		
		int mod = big % small;
		
		if(mod == 0) return small;
		else return euc(small, mod);
		
	}

}