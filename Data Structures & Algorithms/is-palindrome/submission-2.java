class Solution {
    public boolean isPalindrome(String s) {
       if (s == null){
        return false;
       }


       String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       String reversed = new StringBuilder(filtered).reverse().toString();
       return reversed.equals(filtered);
       }  


}

    

