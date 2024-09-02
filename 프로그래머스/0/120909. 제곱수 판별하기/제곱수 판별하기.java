class Solution {
    public int solution(int n) {
        int idx = 1;
        boolean flag = false;
        while(true) {
            int check = (int)Math.pow(idx, 2);
            if(check > 1000000) break;
            if(check == n) flag = true;
            idx++;
        }
        
        return flag?1 : 2;
    }
}