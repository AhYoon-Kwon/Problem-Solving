import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int M, N, K;
	static int[][] paper;
	static int area; //영역의 넓이

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		M = scan.nextInt();
		N = scan.nextInt(); //MxN 크기 모눈종이
		K = scan.nextInt(); //K개의 직사각형
		
		paper = new int[N][M];
		for (int i = 0; i < K; i++) {
			int lx = scan.nextInt();
			int ly = scan.nextInt();
			int rx = scan.nextInt();
			int ry = scan.nextInt();
			
			for (int j = lx; j < rx; j++) {
				for (int k = ly; k < ry; k++) {
					paper[j][k]++;
				}
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(paper[i][j] == 0) {
					area = 0; //영역 넓이 초기화
					dfs(i, j);
					ans.add(area);
				}
			}
		}
		Collections.sort(ans); //넓이를 오름차순으로 정렬
		
		System.out.println(ans.size());
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		
		scan.close();
	}
	
	static void dfs(int x, int y) {
		paper[x][y] = 1; //방문처리겸..!
		area++; //영역의 넓이 더하기
		
		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
			if(paper[nx][ny] == 0) dfs(nx, ny);
		}
	}
}