import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String find = scan.next();
		int N = scan.nextInt(); 
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String ring = scan.next();
			//찾는 문자열이 양쪽끝에 있을 가능성때문에 한바퀴 더 굴려서 비교한다.
			String comp = ring+ring;

			if(comp.contains(find)) cnt++;
		}
		
		System.out.println(cnt);		
		
		scan.close();
	}

}