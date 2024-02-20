public class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
        if(nums[s]==nums[e]){
            return nums[s];
        }
        if(nums[s]==nums[s+1]){
            return nums[s];
        }else{
            s++;
        }
        if(nums[e]==nums[e-1]){
            return nums[e];
        }else{
            e--;
        }
        
    }
    return s;}
}