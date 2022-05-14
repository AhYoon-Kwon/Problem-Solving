import java.util.Scanner;

public class Main {
	
	static int N;
	static int[][] adj, ans;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt(); //정점
		adj = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				adj[i][j] = scan.nextInt();
			}
		}
		
		ans = new int[N][N];
		for (int i = 0; i < N; i++) {
			visited = new boolean[N]; //행기준 탐색이기 때문에 초기화
			
			for (int j = 0; j < N; j++) {
				//방문하지 않았고, 길이 있으면 탐색
				if(!visited[j] && adj[i][j] == 1)
					dfs(i, j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
	
	static void dfs(int x, int y) {
		visited[y] = true; //행기준 탐색이기 때문에 y로
		ans[x][y] = 1; //길이 있다!
		
		for (int i = 0; i < N; i++) {
			//y->i 길이 있나?
			if( adj[y][i] == 1 && !visited[i] )
				//길이 있다면,
				//x ->i 길은 있나?
				dfs(x, i);
		}
	}

}