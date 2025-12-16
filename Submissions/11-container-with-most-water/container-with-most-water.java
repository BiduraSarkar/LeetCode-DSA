class Solution {
    public int maxArea(int[] height) {

        //The approach we used is two−pointer and sliding window:

        //Start from both ends, check area at each step, then shift the lower-valued pointer inward.

        //When pointers meet, we've exhausted all containers and return the answer.



       int i = 0;
       int j = height.length-1;
       int area = 0;
       while(i < j)
       {
            area = Math.max(area, (j-i)*Math.min(height[i],height[j]));

            if(height[i] < height[j])
            i++;
            else
            j--;
       } 
       return area;
    }
}