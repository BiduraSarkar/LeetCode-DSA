class Solution {
    public int minDeletionSize(String[] strs) {

     int R = strs.length;
     int C = strs[0].length();

     char c[][] = new char [R][C];
     int flag;
     int count = 0;

    for(int i =0 ;i<R;i++)
    {
        for(int j=0;j<C;j++)
        {
            c[i][j]=strs[i].charAt(j);
        }
    }

     for(int i =0 ; i<C;i++)
     {  flag = 0;
        for(int j=1; j<R; j++)
        {
            if(c[j-1][i] - c[j][i] > 0)
            {flag = 1;
            break;}
        }
        if(flag == 1)
        count++;

     }

     return count;

    }
}