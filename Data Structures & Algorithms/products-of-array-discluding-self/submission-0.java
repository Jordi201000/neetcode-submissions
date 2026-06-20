class Solution {
    public int[] productExceptSelf(int[] nums) {
        int suf = 1;
        int[] res= new int [nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i] = nums[i-1]*res[i-1];
        }
        int curr;
        for (int i=nums.length-1; i>=0;i--){
            curr=nums[i];
            res[i]=res[i]*suf;
            suf=curr*suf;
        }
        return res;
    }
}  
