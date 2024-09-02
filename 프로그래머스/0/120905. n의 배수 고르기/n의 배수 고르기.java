import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> temp = new ArrayList<>();
        for(Integer i: numlist) {
            if(i % n == 0) temp.add(i);
        }
        int[] answer = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}