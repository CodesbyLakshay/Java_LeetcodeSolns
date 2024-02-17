public class Solution {
    public int findMin(int[] nums) {
        int pivot = 0;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]>nums[s]){
                s=m;
            }
            else if(nums[m]<nums[s]){
                e=m-1;
            }
            else if(e>m && nums[m]>nums[m+1]){
                pivot =m;
                break;
            }
            else if(s<m && nums[m]<nums[m-1]){
                pivot = m;
                break;
            }
            else if(nums[s]==nums[e]){
                pivot=m;
                break;
            }
            else{
                pivot = m+1;
                break;
            }
        }
        if(pivot<nums.length-1){
            return nums[pivot+1];
        }
        else{
            return nums[0];
        }
    }
}