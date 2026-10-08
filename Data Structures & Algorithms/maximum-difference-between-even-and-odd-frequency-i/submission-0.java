class Solution {
    public int maxDifference(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }

        int res = Integer.MIN_VALUE;
        for(int odd : count){
            if(odd == 0 || odd % 2 == 0) continue;
            for(int even : count){
                if(even == 0 || even % 2 == 1) continue;
                res = Math.max(res , odd - even);
            }
        }

        return res;

       /* HashMap< Character , Integer > hMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hMap.put(ch, hMap.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int freq : hMap.values()){

            if(freq % 2 != 0){

                maxOdd = Math.max(maxOdd,freq);

            }  else{
                minEven = Math.min(minEven,freq);
            }     
   
         }

         return maxOdd - minEven ;*/
        
    }
}