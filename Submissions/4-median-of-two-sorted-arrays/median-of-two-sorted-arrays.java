class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int L1 = nums1.length,L2 = nums2.length;
        double finalarr[] = new double [nums1.length+nums2.length];
        int fi =0 ;
        int i1 = 0; 
        int i2 =0;

        while(i1<L1 && i2 < L2)
        {
            if(nums1[i1] < nums2[i2])
            {
                finalarr[fi++] = nums1[i1++];
            }
            else if(nums1[i1] > nums2[i2])
            {
                finalarr[fi++] = nums2[i2++];
            }
            else
            {
                finalarr[fi++] = nums2[i2++];
                finalarr[fi++] = nums1[i1++];
            }
        }

        while(i1 < L1)
        {
            finalarr[fi++] = nums1[i1++];
        }

         while(i2 < L2)
        {
            finalarr[fi++] = nums2[i2++];
        }

        if(fi % 2==0)
        return (finalarr[fi/2-1] + finalarr[fi/2])/2;
        else
        return finalarr[fi/2];
        
    }
}