class Solution {
    public int[] twoSum(int[] nums, int target) {
        int L = nums.length;
        int []a = new int [2];
        int flag=0;
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<L;j++)
            {
                if(nums[i] + nums[j] == target && i!=j)
                {
                    a[0]=i;a[1]=j;
                    flag=1;
                    break;
                }
                
            }
            if(flag==1)
                break;
        }
        
        
        return a;
    }
}