import java.util.*;
class Solution {
    public Object[] solution(int[] num_list, int n) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < num_list.length; i++) {
            if(i % n == 0 || i == 0) {
               temp.add(num_list[i]);
            }
        }
        Object[] answer = temp.toArray();
        return answer;
    }
}