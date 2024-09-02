import java.util.*;
class Solution {
    public Object[] solution(int[] numbers) {
        Object[] answer = new Object[numbers.length];
        List<Integer> temp = new ArrayList<>();
        for(Integer i : numbers) {
            temp.add(i*2);
        }
        answer = temp.toArray();
        return answer;
    }
}