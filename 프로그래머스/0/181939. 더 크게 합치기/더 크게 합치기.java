class Solution {
    public int solution(int a, int b) {
        String sumA = Integer.toString(a) + Integer.toString(b);
        String sumB = Integer.toString(b) + Integer.toString(a);

        int answer = 0;
        int intA = Integer.parseInt(sumA);
        int intB = Integer.parseInt(sumB);

        if(intA >= intB) {
            answer = intA;
        } else answer = intB;
        return answer;
    }
}