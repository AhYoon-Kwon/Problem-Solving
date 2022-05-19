import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt(); //X사 1리터당 요금
		int B = scan.nextInt(); //Y사 기본요금
		int C = scan.nextInt(); //Y사 사용량 상한
		int D = scan.nextInt(); //Y사 1리터당 추가요금
		int P = scan.nextInt(); //사용량
		
		//최대한 싸게
		int ans = 0;
		
		int X = P * A;
		int Y = 0;
		
		if(C < P) {
			P -= C;
			Y = B + P*D;
		} else {
			Y = B;
		}
		ans = Math.min(X, Y);
		System.out.println(ans);
		
		scan.close();
	}

}