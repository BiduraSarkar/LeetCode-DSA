class Solution {
    public int minMaxDifference(int num) {
      String S = Integer.toString(num);
      int L = S.length();
      int maxdiff = 0;
      for(int i=0;i<L;i++)
      {
       String S2 = S;
       char c = S2.charAt(i);
       S2 = S2.replace(c,'9');
       for(int j=0;j<L;j++)
       {
        String S3 = S;
        char c2 = S3.charAt(j);
        S3 = S3.replace(c2,'0');
        int maxn = Integer.parseInt(S2);
        int minn = Integer.parseInt(S3);
        if(maxn - minn > maxdiff)
        maxdiff = maxn - minn;
       }
      }  
      return maxdiff;
    }
}