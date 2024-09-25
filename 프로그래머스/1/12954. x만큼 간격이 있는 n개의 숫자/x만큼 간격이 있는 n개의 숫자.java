class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long init = (long)x;
        answer[0] = init;
        for(int i = 1; i < n; i++) {
            answer[i] = init + x;
            init = answer[i];
        }
        return answer;
    }
}