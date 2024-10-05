class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        for(int idx = a; idx <=b; idx++) {
            answer += idx;
        }
        return answer;
    }
}