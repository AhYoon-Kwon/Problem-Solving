class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        char[][] map = new char[n][n];
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String row = "";
            String rev1 = Integer.toString(arr1[i], 2);
            String rev2 = Integer.toString(arr2[i], 2);
            
            if(rev1.length() < n) {
                while(true) {
                    if(rev1.length() == n) break;
                    rev1 = "0"+rev1;
                }
            }
            if(rev2.length() < n) {
                while(true) {
                    if(rev2.length() == n) break;
                    rev2 = "0"+rev2;
                }
            }
            
            for(int j = 0; j < n; j++) {
                int a = rev1.charAt(j) - '0';
                int b = rev2.charAt(j) - '0';
                
                if(a == 0 && b == 0) row+=" ";
                else row+="#";
            }
            answer[i] = row;
        }

        return answer;
    }
}