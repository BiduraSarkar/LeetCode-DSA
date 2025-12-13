class Solution {
    public boolean isValid(String S)
    {  int L = S.length();
        if(L == 0 )
        return false;
        for(int i=0; i<L; i++)
        {
            char c = S.charAt(i);
            if(!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c=='_')))
            return false;
        }
        return true;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        int L = isActive.length;
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        List<String> L4 = new ArrayList<>();

        for(int i =0; i<L; i++)
        {
            if(isActive[i] == true)
            {
                if( businessLine[i].equals("electronics") && isValid(code[i]) )
                L1.add(code[i]);
                if( businessLine[i].equals("grocery") && isValid(code[i]) )
                L2.add(code[i]);
                if( businessLine[i].equals("pharmacy") && isValid(code[i]) )
                L3.add(code[i]);
                if( businessLine[i].equals("restaurant") && isValid(code[i]) )
                L4.add(code[i]);
            }
        }
        Collections.sort(L1);
        Collections.sort(L2);
        Collections.sort(L3);
        Collections.sort(L4);
        L1.addAll(L2);
        L1.addAll(L3);
        L1.addAll(L4);

        return L1;
        
    }
}