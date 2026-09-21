class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            }else if ( op.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int score:stack){
            sum += score;
        }
        return sum;

     /*   for(int i = 0 ; i < operations.length; i++){

             if(operations[i].equals("C")){
                operations[i] = "0";
                operations[i-1] = "0";
             }
             if(operations[i].equals("D")){
                int prev = Integer.parseInt(operations[i-1]);
                operations[i]=String.valueOf(prev*2);
             }
             if(operations[i].equals("+")){
                int prev1 = Integer.parseInt(operations[i-1]);
                int prev2 = Integer.parseInt(operations[i-2]);
                operations[i] = String.valueOf(prev1+prev2);
             }

        }

        int totalSum = 0;

        for(String op:operations){
            if(!op.equals("+") && !op.equals("C") && !op.equals("D")){
                totalSum += Integer.parseInt(op);
            }
        }
        return totalSum;*/

        
    }
}