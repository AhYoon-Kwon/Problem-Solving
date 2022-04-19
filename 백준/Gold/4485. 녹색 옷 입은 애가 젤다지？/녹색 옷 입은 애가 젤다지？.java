import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class Pos implements Comparable<Pos> {
		int r, c, weight;

		public Pos(int r, int c, int weight) {
			super();
			this.c = c;
			this.r = r;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Pos o) {
			return this.weight-o.weight;
		}
	}

	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int[][] map, distance;
	static boolean[][] visited;
	static int N, ans;
	static final int INF = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tc = 1;
		while(true) {
			N = scan.nextInt();
			if(N == 0) break;
			
			//(0,0)-(N-1,N-1)까지 최소금액으로 이동
			//다익스트라
			
			map = new int[N][N];
			distance = new int[N][N];
			visited = new boolean[N][N];
			ans = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			
			
			//1. 거리를 저장할 distance 배열을 INF로 초기화
			for (int i = 0; i < N; i++) {
				Arrays.fill(distance[i], INF);
			}
			
			//2. 시작정점
			visited[0][0] = true;
			distance[0][0] = map[0][0];
			PriorityQueue<Pos> pq = new PriorityQueue<Pos>();
			pq.add(new Pos(0, 0, map[0][0]));

			while(!pq.isEmpty()) {
				Pos curr = pq.poll();
				
				for (int i = 0; i < 4; i++) {
					int nr = curr.r + dr[i];
					int nc = curr.c + dc[i];
					
					if(nr < 0 || nc < 0 || nr >= N || nc >= N) continue;
					if(visited[nr][nc]) continue;
					
					//3. 아직 방문하지 않은 점들이 가지고 있는 거리 값과, 
					//	현재 정점~방문하지 않은 정점까지의 가중치의 합이 작다면 변경
					int cost = curr.weight + map[nr][nc];
					
					if(distance[nr][nc] > cost) {
						distance[nr][nc] = cost;
						pq.offer(new Pos(nr, nc, cost));
					}
					
				}
			}
			
			ans = distance[N-1][N-1];
			System.out.println("Problem " + tc + ": " + ans);
			tc++;
		}
		
		scan.close();
	}

}