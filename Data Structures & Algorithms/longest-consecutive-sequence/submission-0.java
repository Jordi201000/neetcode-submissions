class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int cur : nums){
            set.add(cur);
        }
        int output=0;
        for(int i:set){
            int seq=0;
            if(!set.contains(i-1)){//im the beagining of the sequance
                seq=1;
                while(set.contains(i+1)){
                    seq++;
                    i++;
                }
            }
            if (seq>output)
            output=seq;



        }

        return output;
    }
}
