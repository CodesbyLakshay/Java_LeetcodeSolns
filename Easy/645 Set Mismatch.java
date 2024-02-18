public class Solution {
    public int[] findErrorNums(int[] nums) {
        int index =0;
        while(index< nums.length){
            int correct = nums[index]-1;
            if( nums[index] != nums[correct]){
                swap(nums, index, correct);
            }
            else {
                index++;
            }
        }
       for (int i = 0; i < nums.length; i++) {
           if(nums[i]!=i+1){
               return new int[]{nums[i],i+1};
           }
    }
    return new int[]{};
    }
    static void swap(int[] arr,int one , int second) {
        int temp = arr[one];
        arr[one] = arr[second];
        arr[second] = temp;
    }
}