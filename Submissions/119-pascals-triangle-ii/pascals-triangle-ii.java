class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> L = new ArrayList<>();
        int i;
        for( i =0; i<= rowIndex; i++)
        { List<Integer> L2 = new ArrayList<>();
            for(int j = 0; j<=i; j++)
            {
                if(j==0)
                L2.add(1);
                else if(j==i)
                L2.add(1);
                else
                {
                    int a = L.get(i-1).get(j);
                    int b = L.get(i-1).get(j-1);
                    L2.add(a+b);
                }

            }
            L.add(L2);
        }

        return L.get(i-1);
        
    }
}