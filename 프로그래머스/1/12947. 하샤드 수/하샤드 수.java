class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        for(Character c: Integer.toString(x).toCharArray()) {
            sum += c - '0';
        }
        if(x % sum == 0) answer = true;
        return answer;
    }
}