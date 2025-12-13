class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {

        int L = buildings.length;
        int mincols[] = new int [n+1];
        int maxcols[] = new int [n+1];
        int minrows[] = new int [n+1];
        int maxrows[] = new int [n+1];


        for(int i=0; i < L; i++)
        {
            int r = buildings[i][0];
            int c = buildings[i][1];

            if(c > maxcols[r])
            maxcols[r] = c;
            if(c < mincols[r] || mincols[r] == 0)
            mincols[r] = c;

            if(r > maxrows[c])
            maxrows[c] = r;
            if(r < minrows[c] || minrows[c] == 0)
            minrows[c] = r;
        }

        int ans = 0;

        for(int i=0; i < L; i++)
        {
            int r = buildings[i][0];
            int c = buildings[i][1];

            if(r > minrows[c] && r < maxrows[c] && c > mincols[r] && c < maxcols[r])
            ans++;

        }

        return ans;
        
    }
}