class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null|| nums.length == 0) return 0; 
        //iterative binary search 
       int low = 0, high = nums.length -1; 
        while (low <= high){
            //to prevent overflow 
            int mid = (high - low )/2 + low ;
            if (nums[mid] == target) return mid;  
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}

