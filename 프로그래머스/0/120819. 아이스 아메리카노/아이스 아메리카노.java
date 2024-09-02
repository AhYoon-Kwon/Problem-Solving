class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = (money >= 5500) ? money / 5500 : 0;
        answer[1] = money - (answer[0]*5500);
        return answer;
    }
}