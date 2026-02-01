class Solution {
    
   
    public List<List<Integer>> threeSum(int[] nums) {
      int l = nums.length;
      List<Integer> L = new ArrayList<>();
      for(int i=0;i<l;i++)
      {
        L.add(nums[i]);
      }
      Collections.sort(L);
      List<List<Integer>> result = new ArrayList<>();

         for(int i=0;i<l;i++)
      {
        nums[i] = L.get(i);
      }

      for(int i=0;i<l;i++)
      { 
        List<Integer> result2 = new ArrayList<>();
        int j = i+1;
        int k = l-1;
        int target = 0 - nums[i];

        result2.add(nums[i]);

        while(j<k)
        {
            if(nums[j] + nums[k] == target)
        {
            result2.add(nums[j]);
            result2.add(nums[k]);
            result.add(result2);
            
            j++;
            while(j<k && nums[j] == nums[j-1])
            j++;
            if(j >= k)
            break;

            result2 = new ArrayList<>();
            result2.add(nums[i]);
            
        }
        else if(nums[j] + nums[k] < target)
        j++;
        else
        k--;
        }
        
      }


      Set<List<Integer>> result1 = new HashSet<>(result);
      result = new ArrayList<>(result1);

      return result;
        
    }
}