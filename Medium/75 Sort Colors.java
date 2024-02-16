public class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int temp;
        int m = 0;
        int e = nums.length-1;
        while(m<=e){
            if(nums[m]==0){
                temp = nums[s];
                nums[s]=nums[m];
                nums[m]=temp;
                s++;
                m++;
            }
            else if (nums[m]==2){
                temp = nums[e];
                nums[e]=nums[m];
                nums[m]=temp;
                e--;
            }
            else{
                m++;
            }
        }
    }
}