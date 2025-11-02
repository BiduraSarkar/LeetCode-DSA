class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int arr[][] = new int [m][n];
        int count = 0;
        
        for(int i=0;i<walls.length;i++)
        {
            int R = walls[i][0];
            int C = walls[i][1];
            arr[R][C] = 2;
            count++;
        }

        for(int i=0;i<guards.length;i++)
        {
            int R = guards[i][0];
            int C = guards[i][1];
            arr[R][C] = 1;
            count++;
        }

        for(int i=0;i<guards.length;i++)
        {
            int R = guards[i][0];
            int C = guards[i][1];
            
            
            for(int j = C+1; j < n;j++)
            {
                if(arr[R][j]==0)
                {arr[R][j] = -1;count++;}
                else if(arr[R][j] == -1)
                continue;
                else
                break;
            }
            for(int j = C-1; j >= 0;j--)
            {
                if(arr[R][j] == 0)
                {arr[R][j] = -1;count++;}
                else if(arr[R][j] == -1)
                continue;
                else
                break;
            }
            for(int j = R-1;j>=0;j--)
            {
               if(arr[j][C] == 0)
                {arr[j][C] = -1;count++;}
                else if(arr[j][C] == -1)
                continue;
                else
                break;
            }
            for(int j = R+1;j<m;j++)
            {
               if(arr[j][C] == 0)
                {arr[j][C] = -1;count++;}
                else if(arr[j][C] == -1)
                continue;
                else
                break;
            }

        }
         return m*n - count;
        
    }
}