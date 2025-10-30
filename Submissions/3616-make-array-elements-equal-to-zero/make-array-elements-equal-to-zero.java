class Solution {

    	public int check_zero(int []a)
	{
		for(int i =0;i < a.length;i++)
		  {
            if(a[i] != 0)
                return 0;
          }
          return 1;
		
	}

    public int countValidSelections(int[] nums) {

        List<Integer> CurrList = new ArrayList<>();
		int L = nums.length;
        for(int i = 0;i<L;i++)
			{if (nums[i] == 0)
		      CurrList.add(i);  
              // to find out all the indices where element is 0 at store it in List
            }

        int count = 0; // to store the count of valid indices
		

		for(int curr : CurrList)
		{
        int D=-1; //going left first
        int[] nums2 = Arrays.copyOf(nums,L);
        int curr2 = curr;
        while(curr >=0 && curr < L )
        {   if(nums2[curr] == 0)
                curr+=D;
            
            else if(nums2[curr]>0)
            {   nums2[curr] = nums2[curr] - 1;
                D= -1*D;
                curr = curr + D;
            }
        }
        if(check_zero(nums2) == 1)
        count++;

        D = 1; //going right
        nums2 = Arrays.copyOf(nums,L);
        curr = curr2;

        while(curr >=0 && curr < L )
        {   if(nums2[curr] == 0)
                curr+=D;
            
            else if(nums2[curr]>0)
            {   nums2[curr] = nums2[curr] - 1;
                D= -1*D;
                curr = curr + D;
            }
        }
        if(check_zero(nums2) == 1)
        count++;

    	}
    	
    	return count;

    }
}