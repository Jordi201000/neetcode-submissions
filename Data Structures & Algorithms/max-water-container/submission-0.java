class Solution {
    public int maxArea(int[] heights) {
      int l=0;
      int r=heights.length-1;
      int max=0;  
    while(l<r){
        int storage= Math.min(heights[l],heights[r])*(r-l);
        if (storage>=max)
            max=storage;
        if(heights[l]<heights[r])
            l++;
        else
            r--;
    }

    return max;


    }
}
