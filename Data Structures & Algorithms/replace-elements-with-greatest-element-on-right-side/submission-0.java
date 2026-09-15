class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRightValue = -1;

        for(int i = n-1; i>=0 ;i--){
            int currentValue = arr[i];

            arr[i] = maxRightValue;

            if(currentValue > maxRightValue){
                maxRightValue = currentValue;
            }
        }
        return arr;

    }
      
}