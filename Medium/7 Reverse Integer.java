public class Solution {
    public int reverse(int x) {
        if (x<0){
            x = -x;
            return -rev(x);
        }
        else{
            return rev(x);
        }
    }

    static int rev(int x){
        int ans =0;
        while(x>0){
            int r = x%10;
            int temp = (ans*10)+r;
            if ((temp - r)/10 != ans) return 0;
            ans=temp;
            x = x/10;
        }
        return ans;
    }
}