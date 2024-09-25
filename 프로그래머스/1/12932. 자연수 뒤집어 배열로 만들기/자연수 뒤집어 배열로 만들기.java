class Solution {
    public int[] solution(long n) {
        char[] ntoS = Long.toString(n).toCharArray();
        int[] answer = new int[ntoS.length];
        int idx = 0;
        for(int i= ntoS.length-1; i >=0; i--) {
            answer[idx] = ntoS[i] - '0';
            idx++;
        }

        return answer;
    }
}