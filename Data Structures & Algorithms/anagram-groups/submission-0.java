class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map < String , List<String> > map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key,new ArrayList()); 
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}

/*Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. Create a frequency array for 'a' through 'z'
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // 2. Convert frequency array to a unique string key
            // Format: "#1#0#2..." where each number is the count of a letter
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            
            // 3. Group the original string by this key
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    } */
