class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
         List<Integer> l = new ArrayList<>();
       for (int i = 0; i < nums.length; i++) {
           if(nums[i]!=i+1){
               l.add(nums[i]);
           }
    }
    return l;
}
static void swap(int[] arr,int one , int second) {
        int temp = arr[one];
        arr[one] = arr[second];
        arr[second] = temp;
    }

}