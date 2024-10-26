import java.util.*;
class Solution {
    //그리워하는 사람, 추억점수, 사진에 찍힌 인물
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        //(사람, 점수)
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i< photo.length; i++) {
            int score = 0; //추억점수
            
            for(int j = 0; j < photo[i].length; j++) {
                if(map.containsKey(photo[i][j])) {
                    score += map.get(photo[i][j]);
                }
                else continue;
            }
            answer[i] = score;
        }
        
        
        return answer;
    }
}