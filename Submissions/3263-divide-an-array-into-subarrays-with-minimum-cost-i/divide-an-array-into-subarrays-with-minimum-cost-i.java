class Solution {
    public int minimumCost(int[] nums) {
    int sum = nums[0];
    List<Integer> L = new ArrayList<>();
    int len = nums.length;
    for(int i=1; i<len; i++)
        L.add(nums[i]);
    
    Collections.sort(L);
    sum += L.get(0)+L.get(1);
    return sum;
    
    }
}