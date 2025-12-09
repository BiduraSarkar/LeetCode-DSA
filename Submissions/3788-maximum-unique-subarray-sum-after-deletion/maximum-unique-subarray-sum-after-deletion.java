class Solution {
    public int maxSum(int[] nums) {

        List<Integer> L = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();
        int sum =0;
        int sum2 = 0;
        int len = nums.length;
        int l=0,l2=0;
        int max = -101;
        for(int i =0;i<len; i++)
        {
            int item = nums[i];
            if(!(L.contains(item)))
            {L.add(item);l++; sum+=item;}
            if(item < 0 && !(L2.contains(item)))
            {L2.add(item);l2++; sum2+=item;
            if(item > max) 
            max = item;
            }
        }
        
        if(l > l2)
        return sum - sum2;
        else if(l==l2)
        return max;
        

        return sum;
    }
}