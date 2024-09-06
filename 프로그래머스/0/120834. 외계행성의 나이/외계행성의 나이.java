class Solution {
    public String solution(int age) {
        
        
        String ageString = String.valueOf(age);
        String answer = "";
        
        for(Character c: ageString.toCharArray()) {
            int temp = Integer.parseInt(String.valueOf(c));
            // System.out.println((char)(temp+97));
            answer += (char)(temp+97);
        }
        
        return answer;
    }
}