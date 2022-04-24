import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static Queue<Integer> q = new LinkedList<Integer>();
	static StringBuilder sb = new StringBuilder();
	static int last;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			String input = scan.next();
			
			switch(input) {
			case "push":
				int x = scan.nextInt();
				last = x;
				push(x);
				break;
			case "pop":
				sb.append(pop() + "\n");
				break;
			case "size":
				sb.append(size() + "\n");
				break;
			case "empty":
				sb.append(empty() + "\n");
				break;
			case "front":
				sb.append(front() + "\n");
				break;
			case "back":
				sb.append(back() + "\n");
				break;
			}
		}
		System.out.println(sb);
		
		scan.close();
	}
	
	static void push(int x) {
		q.add(x);
	}
	
	static int pop() {
		if(q.isEmpty()) return -1;
		else return q.poll();
	}
	
	static int size() {
		return q.size();
	}
	
	static int empty() {
		if(q.isEmpty()) return 1;
		else return 0;
	}
	
	static int front() {
		if(q.isEmpty()) return -1;
		else return q.peek();
	}
	
	static int back() {
		if(q.isEmpty()) return -1;
		else return last;
	}

}