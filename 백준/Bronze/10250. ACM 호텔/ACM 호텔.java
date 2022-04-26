import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int H = scan.nextInt(); //층
			scan.nextInt(); //방
			int N = scan.nextInt(); //손님
			
			//H층 : 배정받는 층 수
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
 
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
		
		scan.close();
	}

}