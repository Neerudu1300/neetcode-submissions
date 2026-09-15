class Solution {
    public void reverseString(char[] s) {
        
        int l = 0;
        int r = s.length-1;
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}

/* here i want to do with space complexity O(N)
 
 String reversed = new StringBuilder(new String(s)).reverse().toString;

 for(int i=0;i<s.length();i++){
 s[i]= reversed.chatAt(i);
 
 }




*/