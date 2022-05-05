import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int N;
	static ArrayList<ArrayList<Integer>> tree;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		tree = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < N+1; i++) {
			tree.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < N-1; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			tree.get(a).add(b);
			tree.get(b).add(a);
		}
		
		bfs();

		scan.close();
	}
	
	static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[N+1];
		int[] parent = new int[N+1];
		
		q.offer(1);
		visited[1] = true;
		
		while(!q.isEmpty()) {
			int par = q.poll();
			
			for (int i = 0; i < tree.get(par).size(); i++) {
				int num = tree.get(par).get(i);
				
				if(!visited[num]) {
					visited[num] = true;
					parent[num] = par;
					q.offer(num);
				}
			}
		}
		
		for (int i = 2; i < parent.length; i++) {
			System.out.println(parent[i]);
		}
	}

}