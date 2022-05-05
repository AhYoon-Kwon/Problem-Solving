import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = 0; //한수의 개수
		
		for (int i = 1; i <= N; i++) {
			String num = Integer.toString(i);
			int[] spl = new int[num.length()];
			for (int j = 0; j < spl.length; j++) {
				spl[j] = num.charAt(j) - '0';
			}
			
			if(spl.length == 1 || spl.length ==2) {
				cnt++;
				continue;
			}
			int d = spl[1] - spl[0]; //등차
			boolean flag = false;
			
			//등차수열 일반항 : a + (n-1)d
			
			for (int j = 1; j < spl.length; j++) {
				if(spl[j] != spl[0] + j*d) {
					flag = true; //한번이라도 걸리면 한수가 아님
					break;
				}
			}
			if(!flag) cnt++;
		}
		System.out.println(cnt);
		
		scan.close();
	}

}