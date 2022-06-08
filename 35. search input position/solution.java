class Solution {
    public int searchInsert(int[] nums, int target) {
        //binary search 
       int low = 0, high = nums.length; 
        while (low < high){
            //prevent overflow 
            int mid = (high - low )/2 + low ;
            if (nums[mid] >= target) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}

