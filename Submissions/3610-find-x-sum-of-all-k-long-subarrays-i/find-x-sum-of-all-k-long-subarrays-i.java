class Solution {

    public int[] findXSum(int[] nums, int k, int x) {
        int L = nums.length;
        int count =0;
        int finalarr[] = new int [L-k+1];

        int max = -99;
        for(int i=0;i<L;i++)
        {if(nums[i] > max)
        max=nums[i];}

        while(count < L-k+1)
        {   int freq[] = new int [max+1];
            for(int i=count; i < k + count; i++)
            {
                freq[nums[i]] += 1;
            }
            int count2 = 0;
            int maxfreqno[] = new int [x];
            int SUM = 0;
            while(count2 < x)
            {    int max2 =-99;
                for(int j=0;j<max+1;j++)
                {
                    if(freq[j] > max2)
                    {max2 = freq[j];maxfreqno[count2] = j;}
                    else if(freq[j] == max2 && j > maxfreqno[count2])
                    {max2 = freq[j];maxfreqno[count2] = j; }
                }
                SUM += max2 * maxfreqno[count2]; 
                freq[maxfreqno[count2]] = -100;
                count2++;
            }
            finalarr[count++] = SUM;
            
        }
        return finalarr;
    }
}