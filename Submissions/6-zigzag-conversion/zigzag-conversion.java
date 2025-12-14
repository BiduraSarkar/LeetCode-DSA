class Solution {
    public String convert(String s, int numRows) {
        int L = s.length();
        char arr[][] = new char[numRows][L];
        int k = 0;
        int I = (numRows-2+1);
        int col = 0;
        int rc = 0;
        String ans = "";
        if(numRows == 1)
        return s;
        for(int j=0;j<L;j++)
        {
          if(k==L)
          break;
          if(j % I == 0)
          {
            while(rc != numRows && k<L)
            {arr[rc++][j] = s.charAt(k);
             k++;
            }
            rc=rc-2;
          }
          else
          {arr[rc--][j] = s.charAt(k);
          k++;
          }
          col++;
        }
        
        for(int i=0; i<numRows; i++)
        {
            for(int j =0 ; j<col;j++)
            {
                if(arr[i][j] != '\u0000')
                ans += arr[i][j];
            }
        }
        return ans;
    }
}