import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> mul = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) mul.add(i);
        }
        int[] answer = mul.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}