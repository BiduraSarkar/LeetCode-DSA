class Solution {
    public int removeElement(int[] nums, int val) {
       int nums2[] = new int[nums.length];
       int k =0;
       for(int i=0; i<nums.length; i++)
       {
            if(nums[i] != val)
            nums2[k++] = nums[i];
       } 

       for(int i=0; i<k; i++)
       nums[i] = nums2[i];

       return k;
    }
}