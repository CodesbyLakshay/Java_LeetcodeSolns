class Solution {
    public int mySqrt(int x) {
        long s =0;
        long ans =0;
        long e = x;
        while(s<=e){
            long m = s+(e-s)/2;
            if(m*m==x){
                return (int)m;
            }
            if(m*m>x){
                e=m-1;
            }
            else{
                ans = m;
                s=m+1;
            }
        }
        return (int)ans;
    }
    }
