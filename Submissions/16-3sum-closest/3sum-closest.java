class Solution {
    public int threeSumClosest(int[] nums, int target) {

    List<Integer> L = new ArrayList<>();
    int len = nums.length;
    for(int i=0; i< len; i++)
    L.add(nums[i]);
    Collections.sort(L);
    for(int i=0; i< len; i++)
    nums[i] = L.get(i);

    int mindiff = -99;
    int result=0;

    for(int i = 0; i< len-2; i++)
    {
        int j = i+1;
        int k = len-1;
        int sum;
        while(j < k)
        {
             sum = nums[i] + nums[j] + nums[k];
             int diff = Math.abs(sum-target);
             if(mindiff == -99)
             {mindiff = diff; result = sum;}
             else if(mindiff > diff)
             {mindiff = diff; result = sum;}
             if(sum < target)
             j++;
             else if(sum == target)
             return sum;
             else
             k--;
        }
    }
        return result;
        
    }
}