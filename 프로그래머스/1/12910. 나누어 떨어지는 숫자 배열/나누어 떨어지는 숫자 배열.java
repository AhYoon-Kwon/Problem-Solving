import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i: arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        if(list.size() != 0) {
            // int[] answer = new int[list.size()];
            int idx = 0;
            for(Integer i: list) {
                answer[idx] = i;
                idx++;
            }
            
        }else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}