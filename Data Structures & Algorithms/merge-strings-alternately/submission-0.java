class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder res = new StringBuilder();

        int i = 0;

        while(i < word1.length() || i < word2.length()){
            if(i < word1.length()){
                res.append(word1.charAt(i));
            }
            if(i < word2.length()){
                res.append(word2.charAt(i));
            }
            i++;
        }

        return res.toString();
        

        
    }
}

/*practice

int n = word1.length(); int m = word2.length();
StringBuilder result = new StringBuilder();

for(int i =0 ; i < n || i < m;i++){
if(i < n) result.append(word1.charAt(i));
if(i < m ) result.append(word2.charAt(j));
 return res.toString();
}


*/