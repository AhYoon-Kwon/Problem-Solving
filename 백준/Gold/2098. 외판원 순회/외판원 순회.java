import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int N;
	static int[][] W, dp;
	static final int INF = 1000000 * 16;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		W = new int[N][N]; //i->j로 가기 위한 비용
		
		dp = new int[N][(1 << N) - 1]; //최소비용 저장해둘 배열
		
		//방문 비용 정보 입력 받기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				W[i][j] = scan.nextInt();
			}
		}
		
		//최소비용 저장할 dp배열 초기화
		for (int i = 0; i < N; i++) {
			Arrays.fill(dp[i], INF);
		}
		
		//0번도시부터 출발
		System.out.println(tps(0, 1));
		
		scan.close();
	}
	
	static int tps(int now, int visit) {
		
		if(visit == (1 << N) - 1) {
			if(W[now][0] == 0) return INF;
			
			else return W[now][0];
		}
		
		if(dp[now][visit] != INF) {
			return dp[now][visit];
		}
		
		for (int i = 0; i < N; i++) {
			
			int next = visit | ( 1 << i );
			
			if((visit & (1 << i)) == 0 && W[now][i] != 0) {
				dp[now][visit] = Math.min(dp[now][visit], tps(i, next) + W[now][i]);
			}
		}
		
		return dp[now][visit];
	}

}