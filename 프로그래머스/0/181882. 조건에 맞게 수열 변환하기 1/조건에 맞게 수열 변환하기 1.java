class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int idx = 0;
        for(Integer i: arr) {
            if(i >= 50) {
                if(i%2==0) answer[idx] = i/2;
                else answer[idx] = i;
            }
            else {
                if(i%2==0) answer[idx] =i;
                else answer[idx] = i*2;
            }
            idx++;
        }
        return answer;
    }
}