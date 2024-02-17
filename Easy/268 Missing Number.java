public class Solution {
    public int missingNumber(int[] nums) {
        int index =0;
        while(index< nums.length){
            int correct = nums[index];
            if( nums[index]<nums.length && nums[index] != nums[correct]){
                swap(nums, index, correct);
            }
            else {
                index++;
            }
        }
       for (int i = 0; i < nums.length; i++) {
           if(nums[i]!=i){
               return i;
           }
       }
return nums.length;
    }
    static void swap(int[] arr,int one , int second) {
        int temp = arr[one];
        arr[one] = arr[second];
        arr[second] = temp;
    }
}