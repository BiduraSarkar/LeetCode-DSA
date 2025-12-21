class Solution {
    public String[] delIndex(String []strs,int delindex)
    {
        int L = strs.length;
        for(int i =0; i<L; i++)
        {
            StringBuilder S = new StringBuilder(strs[i]);
            S.deleteCharAt(delindex);
            strs[i] = S.toString();
        }
        return strs;
    }
    public int minDeletionSize(String[] strs) {
        int c = strs[0].length();
        int count = 0;
        int L = strs.length;
        for(int i = 0; i<strs[0].length(); i++)
        {  int delindex = -1;
            for(int j = 1; j< L; j++)
            {
                if(strs[j-1].charAt(i) > strs[j].charAt(i) && strs[j-1].compareTo(strs[j]) > 0)
                {count++;
                 delindex = i;
                break;}
            }
            if(delindex != -1)
                {strs = delIndex(strs,delindex); i= i-1;}
        }

        return count;

    }
}