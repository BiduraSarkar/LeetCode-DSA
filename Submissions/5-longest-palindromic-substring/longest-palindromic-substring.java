class Solution {
    public boolean isPalin(String s)
    {   int L = s.length();
        for(int i=0; i<L/2;i++)
        {   char c = s.charAt(i);
            char c2 = s.charAt(L-1-i);
            if(c2 != c)
            return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {

        int L = s.length();
        int max = 0;
        String maxs = "";
        for(int i = 0 ; i<L; i++)
        {
            char c = s.charAt(i);
            for(int j=L-1; j>=i;j--)
            {
               char c2 = s.charAt(j);
               if(c2 == c)
               { String temp = s.substring(i,j+1);
                 if(isPalin(temp) & j-i+1 > max)
                 {
                    maxs = temp;
                    max = j-i+1;
                    break;
                 }
               }


            }
            
                
        }

        return maxs;
    }
}