class Solution {
    public int noduplicate(String s)
    {
        for(int i=0;i<s.length();i++)
            {
                char c = s.charAt(i);
                if (s.lastIndexOf(c) != i)
                return 0;
            }
            return 1;
    }
    public int lengthOfLongestSubstring(String s) {
        int flag = 1;
        int subslen = 0;
        while(subslen < s.length() && flag==1)
        { String temp = s;
          subslen++;
          flag = 0;
        while(temp.length()>=subslen)
        { 
          String s2 = temp.substring(0,subslen);
          if (noduplicate(s2) == 1)
            {flag =1;break;}
          temp = temp.substring(1,temp.length());
        }
        
        }

        return (flag == 1)?subslen:subslen-1;
    }
}