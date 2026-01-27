class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ListF = new ArrayList<>();

        for(int i=1; i<= numRows; i++)
        { List<Integer> L = new ArrayList<>();
            for(int j=1; j<=i; j++)
            {
                if(j == 1)
                L.add(1);
                else if(j == i)
                L.add(1);
                else
                {
                    int a = ListF.get(i-2).get(j-1);
                    int b = ListF.get(i-2).get(j-2);
                    L.add(a+b);
                }
            }
            ListF.add(L);
        }

        return ListF;
        
    }
}