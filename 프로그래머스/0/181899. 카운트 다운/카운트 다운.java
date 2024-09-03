class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        int idx = 0;
        for(int i = start_num; i > 0; i--) {
            answer[idx] = i;
            if(i == end_num) break;
            idx++;
        }
        return answer;
    }
}