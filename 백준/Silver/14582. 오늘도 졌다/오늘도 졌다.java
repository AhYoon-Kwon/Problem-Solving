import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] jem = new int[9];
		int[] gul = new int[9];
		for (int i = 0; i < 9; i++) {
			jem[i] = scan.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			gul[i] = scan.nextInt();
		}
		
		int score_jem = 0;
		int score_gul = 0;
		
		boolean flag = false;
		
		for (int i = 0; i < 9; i++) {
			//결국 제미니스는 지게 되기 때문에 중간에 한번이라도 이기고 있으면 역전패 당하는 것이다
			//1회 초에 점수를 냈다면 이미 이기고 있는것
			score_jem += jem[i];
			
			if(score_jem > score_gul) {
				flag = true;
			}
			score_gul += gul[i];
		}
		
		System.out.println(flag? "Yes" : "No");
		
		scan.close();
	}

}