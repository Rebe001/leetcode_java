class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i=0; i< nums.length; i++){
            int b = nums[i];
            int a = target - nums[i];
            if (hash.containsKey(a)){
                return new int[]{hash.get(a), i};
            }
            hash.put(b, i);
        }
        return null;
    }
}

