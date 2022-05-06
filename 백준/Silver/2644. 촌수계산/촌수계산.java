import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int n, m, A, B;
	static ArrayList<ArrayList<Integer>> relation;
	static boolean[] visited;
	static int[] dist; //촌수 저장

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); //정점
		A = scan.nextInt();
		B = scan.nextInt(); //촌수 계산할 두사람
		m = scan.nextInt(); //간선
		relation = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n+1; i++) {
			relation.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			
			relation.get(u).add(v);
			relation.get(v).add(u);
		}
		
		visited = new boolean[n+1];
		dist = new int[n+1];
		System.out.println(bfs());
		
		scan.close();
	}
	
	static int bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[A] = true;
		q.offer(A); //A를 찾을거야
		
		while(!q.isEmpty()) {
			int now = q.poll();
			if(now == B) return dist[B];
			
			for (int i = 0; i < relation.get(now).size(); i++) {
				int conn = relation.get(now).get(i);
				
				if(!visited[conn]) {
					visited[conn] = true;
					q.add(conn);
					dist[conn] = dist[now] + 1;
				}
			}
		}
		//관계 없으면 -1
		return -1;
	}

}