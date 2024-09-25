class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int numP = 0;
        int numY = 0;
        
        for(Character c: s.toCharArray()) {
            if(c=='p' || c=='P') numP++;
            else if(c=='y' || c=='Y') numY++;
            else continue;
        }
        answer = (numP == numY) ? true: false;
        if(numP == 0 && numY == 0) answer = true;

        return answer;
    }
}