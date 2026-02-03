class Solution {
    public boolean isTrionic(int[] nums) {
    int l = nums.length;
    int p = -1001, q = -1001, r = -1001, i=1;

    while( i<l && nums[i] > nums[i-1])
      { 
        p= nums[i];
        i++;
       }
    while(i < l && nums[i] < nums[i-1])
        { q = nums[i];
        i++;
        }
    while(i < l && nums[i] > nums[i-1])
      { 
        r = nums[i];
        i++;
       }

    return i==l && p != -1001 && q != -1001 && r != -1001 ; 
       
    }
}