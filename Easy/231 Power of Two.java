public class Solution {
    public boolean isPowerOfTwo(int n) {
        int ans = 1;
        if (n==1073741824)
        return true;
        for(int i= 1; i<=30; i++){
                if (ans == n){
                    return true;
                }
                
            ans  = ans*2;
            }
        return false;
    }
}
