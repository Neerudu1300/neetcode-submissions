class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        char[] p = s.toCharArray();
        for(int i =0; i<s.length()-1;i++){
           sum += Math.abs(p[i+1] - p[i]);
            
        }
        return sum;
        
    }
}