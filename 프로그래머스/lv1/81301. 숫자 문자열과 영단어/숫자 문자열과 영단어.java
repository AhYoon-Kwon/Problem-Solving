class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < sNum.length; i++) {
            String temp = sNum[i];

            if(s.contains(temp)) {
                String num = Integer.toString(i);
                s = s.replace(temp, num);
            }
        }
        answer = Integer.parseInt(s);
        
        return answer;
    }
}