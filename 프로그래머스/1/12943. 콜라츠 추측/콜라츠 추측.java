class Solution {
    public long solution(long num) {
        long answer = 0;
        while(num != 1) {
            if(num == 1) break;
            if(answer>=500) {
                answer = -1;
                break;
            }
            if(num % 2 == 0) {
                num /= 2;
            }
            else {
                num *= 3;
                num+=1;
            }
            answer+=1;
            //System.out.printf(" %d번: %d -> ", answer, num);
        }
        // answer = (answer>=500)? -1: answer;
        return answer;
    }
}