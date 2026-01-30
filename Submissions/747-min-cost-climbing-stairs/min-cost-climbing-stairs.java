class Solution {
    public Map<Integer, Integer> map = new HashMap<>(); 
    public int mincost(int []cost,int i,int L)
    {
        if(i >= L)
        return 0;
        else if(i==-1)
        return Math.min(mincost(cost,i+1,L),mincost(cost,i+2,L));
        else
        {   if (!(map.containsKey(i)))
            {   int costati =  cost[i] + Math.min(mincost(cost,i+1,L),mincost(cost,i+2,L));
                map.put(i,costati); 
            }
            return map.get(i);
        }
    }
    public int minCostClimbingStairs(int[] cost) {
        int i = -1;
        int L = cost.length;
       return mincost(cost,i,L);
    }
}