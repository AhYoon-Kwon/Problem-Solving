import java.util.*;

//최단 거리 -> bfs 
class Solution {
    
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][];
    
    //현재 위치 클래스 
    static class Pos {
        int x, y, dist;
        
        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        visited = new boolean[maps.length][maps[0][length]];
        
        for(int x = 0; x < maps.length; x++) {
            for(int y = 0; y < maps[x].legnth; y++) {
                
            }
        }
        
        return answer;
    }
    
    static void bfs(int[][] maps) {
        
        Queue<Pos> q = new LinkedList();
        
        //1. 일단 제일 출발 위치를 큐에 넣어
        q.add(new Pos(0, 0));
        visited[0][0] = true;
        
        whild(q.isEmpty())
        
        //2. 하나 위에 있는거 뽑아봐
        Pos now = q.poll();
        
        
    }
}