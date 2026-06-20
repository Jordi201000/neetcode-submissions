class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            seen.add(nums[i]);
        }
        if (seen.size()<nums.length)
        return true;

        return false;

    }
}
