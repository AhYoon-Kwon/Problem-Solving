import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	//최소 몇번만에 가야하는가? -> 최단거리 -> BFS
	static int[] move;
	static int[] count;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //사다리 수
		int M = scan.nextInt(); //뱀 수
		move = new int[101]; //보드에 사다리와 뱀의 이동 체크
		count = new int[101]; //이동한 횟수 체크
		for (int i = 0; i < N+M; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			//x번에 도착하면 y번으로 이동
			move[x] = y;
		}
		
		bfs();
		
		scan.close();
	}
	
	static void bfs() {
		//방문 체크용 : 1번부터 시작
		boolean[] visited = new boolean[101];
		Queue<Integer> q = new LinkedList<Integer>();
		
		//최초시작점 방문처리 후 q에 넣어주기
		visited[1] = true;
		q.offer(1);
		
		//q가 빌때까지 계속
		while(!q.isEmpty()) {
			
			//출발하는 칸
			int arrive = q.poll();
			
			//100번칸에 도착
			if(arrive == 100) {
				System.out.println(count[100]);
				return;
			}
			
			//주사위 1~6번 상황 
			for (int dice = 1; dice <= 6; dice++) {
				//앞으로 갈 곳
				int to = arrive + dice;
				
				//가야 하는 곳이 100번칸을 넘거나 이미 방문한적 있다면 패스
				if(to > 100) continue;
				if(visited[to]) continue;
				
				//가는 곳 방문 처리 후, 사다리나 뱀이 있는지 체크
				visited[to] = true;
				if(move[to] != 0) {
					//사다리나 뱀을 타고 간 곳이 방문한적이 없으면 방문 처리 후 이동횟수 증가
					if(!visited[move[to]]) {
						q.offer(move[to]);
						visited[move[to]] = true;
						count[move[to]] = count[arrive] + 1;
					}
				}
				else {
					//사다리나 뱀이 없으면 도착한 곳을 큐에 추가
					q.offer(to);
					count[to] = count[arrive] + 1;
				}
			}
		}
	}

}