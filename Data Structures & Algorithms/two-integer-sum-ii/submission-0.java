class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(r>l){
            if(numbers[l]+numbers[r]==target)
                break; 
            else if(r>l && numbers[l]+numbers[r]>=target)
                r--;
            else if(r>l && numbers[l]+numbers[r]<=target)
                l++;
            
        }

        int[] output=new int[] {l+1,r+1};
        return output;


    }
}
