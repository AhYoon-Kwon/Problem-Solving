import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt(); //M*N크기 보드
		char[][] board = new char[N][M];
		for (int i = 0; i < N; i++) {
			String input = scan.next();
			for (int j = 0; j < M; j++) {
				board[i][j] = input.charAt(j);
			}
		}
		
		//비교할 체스판 두가지 초기화
		char[][] w = new char[8][8];
		char[][] b = new char[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((i+j)%2 == 0) {
					w[i][j] = 'W';
					b[i][j] = 'B';
				}
				else {
					w[i][j] = 'B';
					b[i][j] = 'W';
				}
			}
		}
		
		int cntW= 0;
		int cntB = 0;
		
		int ans = Integer.MAX_VALUE; //최솟값
		
		//8*8씩 전체 탐색
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				cntW = 0;
				cntB = 0;
				
				//W가 첫 블럭인 경우
				for (int r = i, nr = 0; r < i+8; r++, nr++) {
					for (int c = j, nc = 0; c < j+8; c++, nc++) {
						if(w[nr][nc] != board[r][c]) {
							cntW++;
						}
					}
				}
				//B가 첫 블럭인 경우
				for (int r = i, nr = 0; r < i+8; r++, nr++) {
					for (int c = j, nc = 0; c < j+8; c++, nc++) {
						if(b[nr][nc] != board[r][c]) {
							cntB++;
						}
					}
				}

				//위의 두가지중 더 작은거
				ans = Math.min(ans, Math.min(cntW, cntB));
			}
		}
		
		System.out.println(ans);
		
		scan.close();
	}
	
}