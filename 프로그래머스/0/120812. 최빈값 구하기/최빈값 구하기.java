import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array) {
        //int[]를 ArrayList로
        List<Integer> listArray = Arrays.stream(array)
                                    .boxed()
                                    .collect(Collectors.toList());
        // 값 나오는 개수 저장할 배열 크기를 위한 max 값 구하기
        int max = Collections.max(listArray);
        int[] cnt = new int[max+1];
        
        // 숫자 빈도수 세기
        for(int idx = 0; idx < listArray.size(); idx++) {
            cnt[listArray.get(idx)] += 1; 
        }
        // System.out.println(Arrays.toString(cnt));
        
        int answer = 0;
        int maxCnt = 0;
        int maxCntNum = 0;
        int isAnswers = 0;
        
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] > maxCnt) {
                maxCnt = cnt[i]; //최빈값의 개수
                maxCntNum = i; //최빈값
            }
        }
        // System.out.println(maxCnt);
        for(Integer i: cnt) {
            if(maxCnt == i) isAnswers+=1; //최빈값 개수 동일한게 있는지?
        }
        // System.out.println(isAnswers);
        answer = (isAnswers > 1) ? -1 : maxCntNum;
        
        return answer;
    }
}