class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int L = nums.length;
        int a[] = new int [2];
        int count = 0;
        for(int i=0;i<L;i++)
        {
            for(int j=L-1;j>i;j--)
            {
                    if(nums[i] == nums[j])
                    {
                        a[count++] = nums[i];

                    }
                    if(count == 2)
                    break;
            }
            if(count == 2)
            break;
        }
        return a;
    }
}