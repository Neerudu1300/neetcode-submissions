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
/*Let us try Intuition Method*/
/* StringBuilder newStr = new StringBuilder();
for(char c : s.toCharArray()){
  if(Character.isLetterOrDigit(c)){

  newStr.append(Character.toLowerCase(c));
  }
}
return newStr.toString().equals(newStr.reverse().toString());


Now let us try with 2 pointers

public boolean isPalindrome(String s){
   int l= 0,r = s.lenth()-1;

   while(l<r){
     while(l < r && !alphaNum(s.charAt(l)))
     l++;
   }
   while(r> l && !alphaNum(s.charAt(r))){
   r--;
   }

   if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
   return false;
   }
   l++;r--;
   }
   return true;
   }

   public boolean aplhaNum(char c){
   return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >='0' && c <='9');
   }










}










 */

    

