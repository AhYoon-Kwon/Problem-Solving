import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N, M, V;
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	static StringBuilder sb1, sb2;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt(); //정점
		M = scan.nextInt(); //간선
		V = scan.nextInt(); //탐색을 시작할 정점 번호
		
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) { //정점개수만큼 리스트
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		//정점이 여러개면 작은 순서로 방문하기 때문에 정렬해줘야 함
		for (int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i));			
		}
		
		sb1 = new StringBuilder();
		sb2 = new StringBuilder();
		
		visited = new boolean[N+1];
		dfs(V);
		System.out.println(sb1);
		
		visited = new boolean[N+1];
		bfs(V);
		System.out.println(sb2);
		
		scan.close();
	}
	
	static void dfs(int n) {
		visited[n] = true;
		sb1.append(n + " ");
		
		for (int i = 0; i < graph.get(n).size(); i++) {
			int num = graph.get(n).get(i);
			if(!visited[num]) {
				dfs(num);
			}
		}
	}
	
	static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[n] = true;
		q.add(n);
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			visited[temp] = true;
			sb2.append(temp + " ");
			
			for (int i = 0; i < graph.get(temp).size(); i++) {
				int num = graph.get(temp).get(i);
				if(visited[num]) continue;
				visited[num] = true;
				q.add(num);
			}

		}
		
	}

}
