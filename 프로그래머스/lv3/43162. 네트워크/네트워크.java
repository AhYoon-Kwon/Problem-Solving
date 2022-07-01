import java.util.*;

class Solution {
    static int answer = 0;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list;
    
    public int solution(int n, int[][] computers) {
        list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers[i].length; j++) {
                if(i == j) continue;
                
                if(computers[i][j] == 1) {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        visited = new boolean[n+1];
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(n, computers, i); 
                answer++;
            }
        }

        return answer;
    }
    
    static void dfs(int n, int[][] computers, int d) {
        visited[d] = true;
        
        for(int i = 0; i < list.get(d).size(); i++) {
            int now = list.get(d).get(i);
            
            if(!visited[now]) {
                visited[now] = true;
                dfs(n, computers, now);
            }
        }
    }
}