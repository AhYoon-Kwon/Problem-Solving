class Solution {
    public int solution(int n) {
        int answer = 1;
        if((n / 7) > 1) {
            if((n%7) == 0) answer--;
            answer+=(n/7);
        }
        return answer;
    }
}