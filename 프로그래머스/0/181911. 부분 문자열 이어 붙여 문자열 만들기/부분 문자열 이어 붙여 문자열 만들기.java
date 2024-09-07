import java.util.*;
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        //parts[i] = [s, e] -> s~e인덱스 문자열
        for(int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1] + 1;
            // System.out.printf("%d %d\n", s, e);
            
            String spl = my_strings[i].substring(s, e);
            // System.out.printf("%s -> %s\n", my_strings[i], spl);
            // System.out.println(spl);
            answer += spl;
        }
        return answer;
    }
}