import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];
        Arrays.fill(check, false);
        for(Integer i: numbers) {
            check[i] = true;
        }
        
        for(int idx = 1; idx<check.length; idx++) {
            if(!check[idx]) answer+=idx;
            // System.out.printf("check[%d] = %b\n", idx, check[idx]);
        }
        return answer;
    }
}