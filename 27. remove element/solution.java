class Solution {
    public int removeElement(int[] nums, int val) {
        //approach 1: two pointers approach
        if (nums.length == 0) return 0;
        int x = 0;
        for (int y =0; y< nums.length; y++){
            if (nums[y] != val){
                nums[x++] = nums[y];
            }
        }
         return x;
    }
    
    public int removeElement(int[] nums, int val) {  
    //approach 2: when elements to remove are rare 
    int x = 0;
    int n = nums.length;
    while (x < n){
        if (nums[x] == val){
            //swap in the last value you want to remove it
            nums[x] = nums[n-1];
            n--;
        }else{
            x++;
        }
    }
    return n;
    }
}