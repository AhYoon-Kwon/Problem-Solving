import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ans = 0, ans2 = 0;
		
		//1. 전체 상금의 22% 납부
		ans = (int)(N*0.78);
		System.out.print(ans + " ");
		
		//2. 전체 금액의 20%의 22%만 납부
		ans2 = N - (int)(N*0.2*0.22);
		System.out.println(ans2);
		
		scan.close();
	}

}