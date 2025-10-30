class Solution {
    public int count_one(String s)
    { int sum =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            sum++;
        }
        return sum;
    }
    public int numberOfBeams(String[] bank) {

        int count[] = new int [bank.length];
        for(int i =0; i<bank.length;i++)
        {
            count[i] = count_one(bank[i]);
        }
        int sum = 0;
        int prev = count[0];
        for(int i =1; i<bank.length;i++)
        {   if(count[i] != 0)
            {
                sum += prev*count[i];
                prev = count[i];
            }
            else
            sum += prev*count[i];
        }
        return sum;
    }
}