class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ant = {5, 3, 1};
        
        for(Integer i : ant) {
            //개미 카운트
            if(hp > 0) {
                answer+= (hp/i);
                hp -= (hp/i)*i;
            }
            else break;
        }
        
        return answer;
    }
}