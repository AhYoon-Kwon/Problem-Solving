import java.util.Scanner;

public class Main {
	
	//*플로이드-와샬
	// - 모든 정점에서 모든 정점사이의 최단거리
	
	static final int INF = 9999999;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //정점
		int M = scan.nextInt(); //간선
		
		//정점끼리의 최단거리를 저장할 배열
		int[][] dist = new int[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				dist[i][j] = INF;
				
				//자기자신이면 최단거리 0
				if(i == j) dist[i][j] = 0;
			}
		}
		
		for (int i = 0; i < M; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			//친구면 거리 1로 초기화
			dist[A][B] = dist[B][A] = 1;
		}
		
		//플로이드-와샬 알고리즘
		//임의의 점 하나를 지나치는 경로와 바로 가는 경로 비교
		for (int k = 1; k <= N; k++) {
			
			for (int a = 1; a <= N; a++) {
				for (int b = 1; b <= N; b++) {
					dist[a][b] = Math.min(dist[a][b], dist[a][k] + dist[k][b]);
				}
			}
		}
		
		int min = INF; 	//최소의 케빈 베이컨의 수
		int idx = 0; 	//케빈 베이컨의 수가 가장 작은 사람
		
		for (int i = 1; i <= N; i++) {
			int sum = 0; //케빈 베이컨의 수 
			
			for (int j = 1; j <= N; j++) {
				sum += dist[i][j];
			}
			if(min > sum) {
				min = sum;
				idx = i;
			}
		}
		
		System.out.println(idx);
		scan.close();
	}
	
}