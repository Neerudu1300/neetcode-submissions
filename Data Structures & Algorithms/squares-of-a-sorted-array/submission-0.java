class Solution {
    public int[] sortedSquares(int[] nums) {

        int l = 0; int r = nums.length-1;
        int resIndex = nums.length-1;

        int[] res = new int[nums.length];

        while(l <= r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                res[resIndex] = nums[l]*nums[l];
                l++;
            }else{
                res[resIndex] = nums[r]*nums[r];
                r--;
            }
            resIndex--;

        }
        return res;

    } 
    
}