public class Solution {
    public int[] plusOne(int[] digits) {
        for(int i =digits.length-1;i>=0;i-- ){
            if(digits[i]!=9){
                digits[i]+=1;
                break
            }
            else{
                digits[i]=0;
            }
        }
        return digits;
        
    }
}
