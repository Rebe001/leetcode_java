class Solution {
    public int removeDuplicates(int[] nums) {
        //two pointers approach
        //j is the fast runner, to keep track of the current element in the original array 
        //i is the slow runner, to for the unique elements.
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1 ; j < nums.length; j++){
            if(nums[i] < nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}