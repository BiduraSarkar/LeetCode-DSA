class Solution {
    
    public int removeDuplicates(int[] nums) {
        List<Integer> L = new ArrayList<>();
        char c;
        int k=-1;
        for(int i=0; i<nums.length; i++)
        {
            if(k == -1 || L.get(k) != nums[i])
                {L.add(nums[i]); k++;}   
        }

        for(int i=0; i<=k; i++)
        nums[i] = L.get(i);

        return k+1;
    }
}