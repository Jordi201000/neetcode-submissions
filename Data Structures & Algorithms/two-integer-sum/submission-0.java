class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap = new HashMap<>();
        int[] out = new int[2];
        for (int i=0;i<nums.length;i++){
            int curr = nums[i];
            if (myMap.containsKey(target-curr)){
            out[0] = myMap.get(target-curr);
            out[1] = i;
            return out;
            }
            myMap.put(curr,i);
        }
        return out;
    }
}
