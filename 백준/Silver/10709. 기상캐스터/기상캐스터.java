import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt(); //H*W
		char[][] map = new char[H][W];
		scan.nextLine();
		for (int i = 0; i < H; i++) {
			map[i] = scan.nextLine().toCharArray();
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < H; i++) {
			int cnt = 0;
			for (int j = 0; j < W; j++) {

				if(map[i][j] == 'c') {
					cnt = 1; //시작부터 구름이 있다
					sb.append(0 + " ");
				} else if(map[i][j] == '.') {
					//구름이 없음
					if(cnt == 0) sb.append(-1 + " ");
					else {
						sb.append(cnt + " ");
						cnt++;
					}
				} 
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
		scan.close();
	}

}
