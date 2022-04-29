import java.util.Scanner;

public class Main {
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int M, N, K;
	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			M = scan.nextInt(); //가로
			N = scan.nextInt(); //세로
			K = scan.nextInt(); //배추가 심어져 있는 위치의 개수
			map = new int[M][N];
			visited = new boolean[M][N];
			
			for (int i = 0; i < K; i++) {
				int r = scan.nextInt();
				int c = scan.nextInt();
				
				//배추 위치 체크
				map[r][c] = 1;
			}
			
			int ans = 0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					//방문안했고 && 배추가 심어져있으면 탐색
					if(!visited[i][j] && map[i][j] == 1) {
						dfs(i, j);
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		}
		
		scan.close();
	}
	
	static void dfs(int x, int y) {
		//방문했음 체크
		visited[x][y] = true;
		
		//사방탐색하면서 체크
		for (int d = 0; d < 4; d++) {
			int nr = x + dr[d];
			int nc = y + dc[d];
			
			if(nr < 0 || nc < 0 || nr >= M || nc >= N) continue;
			if(visited[nr][nc]) continue;
			
			//상하좌우 중 배추가 있으면 가서 또 탐색
			if(map[nr][nc] == 1) {
				dfs(nr, nc);
			}
		}
		
	}

}