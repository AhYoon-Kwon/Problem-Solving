import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        
        for(int i : food) {
            if(idx == 0) {
                idx++;
                continue;
            }
            if(i >= 2) {
                String temp = String.valueOf(idx);
                for(int j = 0; j < i/2; j++) sb.append(temp);
            } else {
                idx++;
                continue;
            }
            idx++;
            
            // System.out.println(sb.toString());
        }
        answer += sb.toString();
        
        StringBuilder sbrev = new StringBuilder(sb.reverse());
        // System.out.println(answer);
        
        answer += "0";
        answer += sbrev.toString();
        
        return answer;
    }
}