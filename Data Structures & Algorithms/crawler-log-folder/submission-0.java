class Solution {
    public int minOperations(String[] logs) {

      Stack<String> stack = new Stack<>();
        for(String log : logs){
            if(log.equals("../")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if (!log.equals("./")){
                stack.push(log);
            }
        }
        return stack.size();

        

       /* int res = 0;
        for(String log : logs){
            if(log.equals("./")){
                continue;
            }
            if(log.equals("../")){
                res = Math.max(0,res-1);
            }
        else{
            res++;
        }
    }
    return res;*/
        
    }
}