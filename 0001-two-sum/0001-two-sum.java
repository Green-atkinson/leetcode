class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        //create temp value to check for target
        int temp;
        //create a loop, goes langth of given array
        for(int i=0; i<nums.length; i++) {
            temp = target - nums[i];
            //check if hm contains 'target - current index'
            if (hm.keySet().contains(temp)) {
                return new int[] {hm.get(temp), i};
            }
            hm.put(nums[i], i);
        }
        return new int[0];
    }
}