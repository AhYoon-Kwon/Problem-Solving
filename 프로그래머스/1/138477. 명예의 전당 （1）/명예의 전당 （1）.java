import java.util.*;
class Solution {
    public Integer[] solution(int k, int[] score) {
        //상위 k번쨰 이내..
        //매일 1명이 점수가 나옴 
        
        Integer[] answer = new Integer[score.length];
        List<Integer> answerList = new ArrayList<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //제일 작은애가 root 
        
        
        //명예의 전당 최하위 점수 
        int day = 1;
        for(Integer i : score) {
            // System.out.printf("%d일차 \n", day);
            if(pq.size() < k) {
                pq.add(score[day-1]);
                answerList.add(pq.peek());
                // System.out.printf("제일 작은 점수: %d\n", pq.peek());
            }
            else { //k일 보다 넘을 때 
                //점수 높은지 확인 
                
                if(pq.peek() <= score[day-1]) {
                    // System.out.println(score[day-1]);
                    
                    pq.poll();
                    pq.add(score[day-1]);
                    answerList.add(pq.peek());
                    // System.out.printf("제일 작은 점수: %d\n", pq.peek());
                }
                else {
                    answerList.add(pq.peek());
                }
            }
            day++;
            
        }
        
        answer = answerList.stream()
                            .toArray(Integer[]::new);
        
        
        return answer;
    }
}