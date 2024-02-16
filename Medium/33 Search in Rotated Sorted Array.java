public class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s+ (e-s)/2;
            if(nums[m]<nums[s]){
                e = m-1;
            } else if (nums[s]<nums[m]) {
                s=m;
            }
            else if(m<e && nums[m+1]<nums[m]){
                pivot =m;
                break;
            } else if (m>s && nums[m-1]>nums[m]) {
                pivot = m ;
                break;
            } else if (nums[s]==nums[e]) {
                pivot = m;
                break;
            }
            else {
                pivot =  m+1;
                break;
            }

        }
        int ans = binarySearch(nums , target , 0,pivot);
        if(ans != -1){
            return ans;
        }
        else{
            return binarySearch(nums , target , pivot+1, nums.length-1 );
        }
    }
    static int binarySearch(int[] arr, int target , int s , int e){

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}