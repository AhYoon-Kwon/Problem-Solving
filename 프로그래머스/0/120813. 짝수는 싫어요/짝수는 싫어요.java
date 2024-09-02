import java.util.*;
class Solution {
    public Object[] solution(int n) {
        List<Integer> odds = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) odds.add(i);
        }
        Object[] answer = odds.toArray();
        return answer;
    }
}