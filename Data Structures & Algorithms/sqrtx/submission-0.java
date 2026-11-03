class Solution {
    public int mySqrt(int x) {
     if( x < 2){
        return x;
     }
     long l = 1;
     long r = x/2;
     int ans = 0;

     while(l <= r){
        long m = l + (r-l)/2;
        long square = m * m;

        if(square == x){
            return (int) m;
        }
        else if ( square < x){
            ans = (int) m;
            l = m+1;
        }else{
            r = m-1;
        }
     }
     return ans;
        
    }
}