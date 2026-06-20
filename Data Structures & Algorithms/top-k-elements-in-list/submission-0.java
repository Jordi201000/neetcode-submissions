class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counter=new HashMap<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );
        for (int curr : nums){
        counter.put(curr, counter.getOrDefault(curr, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            maxHeap.offer(new int[]{entry.getValue(), entry.getKey()});
        }    
        
        int[] output = new int[k];
    
        for(int i=0;i<k;i++){

            output[i]=maxHeap.poll()[1];
        }
        return output;
    }
    
}
