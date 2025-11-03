class Solution {
    public int minCost(String colors, int[] neededTime) {
        int removetime=0;
        int L = colors.length();
        for(int i =0 ;i<L-1;i++)
        {
            char c1 = colors.charAt(i);
            int max = neededTime[i];
            removetime += max;
            int j = i+1;
            for(;j<L && colors.charAt(j) == c1;j++)
            {
                removetime += neededTime[j];
                if(neededTime[j] > max)
                max = neededTime[j];
            }
            removetime = removetime - max;
            i=j-1;
        }
        return removetime;
    }
}