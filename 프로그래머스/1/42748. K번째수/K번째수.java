import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            
            //commands[i] = [2, 5, 3] 2~5번째 자르고 
            //그리고 정렬, 그리고 3번째 수
            int a = commands[i][0];
            int b = commands[i][1];
            int k = commands[i][2];
            
            int[] cut = new int[b-a+1];
            for(int j = 0; j < cut.length; j++) {
                cut[j] = array[a-1];
                a++;
            }
            
            Arrays.sort(cut);
            
            answer[i] = cut[k-1];
        }
        
        return answer;
    }
}