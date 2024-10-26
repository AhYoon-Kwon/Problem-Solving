class Solution {
    public String solution(int a, int b) {
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] date = new String[] {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int days = 0;
        
        if(a > 1) {
            for(int m = 2; m <= a; m++) {
                days += month[m-1];
            }
        }
        
        days += b;
        
        //SUN,MON,TUE,WED,THU,FRI,SAT (0, 1, 2, 3, 4, 5, 6), 금요일은 5 
        int idx = (days+4)%7;
        
        String answer = date[idx];
        return answer;
    }
}