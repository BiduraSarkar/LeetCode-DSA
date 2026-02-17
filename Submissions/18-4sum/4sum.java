class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<Integer> temp = new ArrayList<>();
        int l = nums.length;

        for(int i=0; i<l;i++)
            temp.add(nums[i]);

        Collections.sort(temp);

        for(int i=0; i<l;i++)
            nums[i] = temp.get(i);

        List<List<Integer>> result = new ArrayList<>();

        int i = 0;
        while( i < l-3)
        {
            int j = i+1;
            int k = l-1;
            List<Integer> L = new ArrayList<>();
            while(j < k)
            {   
                int m = j+1;

                while(m < k )
                {
                    if(((double)nums[i] + nums[j] + nums[m] + nums[k]) - (double)target > 0)
                    k--;
                    else if(((double)nums[i] + nums[j] + nums[m] + nums[k]) - (double)target < 0)
                    m++;
                    else
                    { L.add(nums[i]);
                      L.add(nums[j]);
                      L.add(nums[m]);
                      L.add(nums[k]);
                      result.add(L);
                      L = new ArrayList<>();
                      m++;
                      while(m < k && ((nums[m-1] == nums[m]) || (nums[k] == nums[m])))
                      m++;
                      
                    }

                   
                    
                }

                j+=1;
                while(j < k && nums[j-1] == nums[j])
                j+=1;
                k=l-1;

            }

            i+=1;
            while(i < l-3 && nums[i-1] == nums[i])
            i+=1;
        }

        return result;
        
    }
}