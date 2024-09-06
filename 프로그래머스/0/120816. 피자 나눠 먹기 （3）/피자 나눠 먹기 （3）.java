class Solution {
    public int solution(int slice, int n) { //피자 조각수, 먹을 사람수
        //n명이 최소 한조각 이상 먹으려면..
        int answer = 0;
        int pizza = 1;
        while(true) {
            if((slice*pizza) / n >= 1) {
                answer = pizza;
                break;
            }
            pizza++;
        }
        return answer;
    }
}