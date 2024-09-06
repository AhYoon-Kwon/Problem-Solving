class Solution {
    public int solution(int n) { // 피자 나눠먹을 사람 수 n
        int answer = 0;
        //n명이 남기지 않고 모두 같은 수 조각을 먹어야함
        //1판에 6조각, 6*pizza=n
        
        int pizza = 1;
        while(true) {
            if((pizza*6) % n == 0) {
                answer = pizza;
                break;
            }
            pizza++;
        } 
        
        return answer;
    }
}