public class Solution {
    public boolean isPalindrome(int x) {
        int temp =x;
        int ans=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int r = x%10;
          ans = (ans*10) +r;
          x = x/10;
        }
        if(ans==temp){
            return true;
        }
        return false;
    
    }
}