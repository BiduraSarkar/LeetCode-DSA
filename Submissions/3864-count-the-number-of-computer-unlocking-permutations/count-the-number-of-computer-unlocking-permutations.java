class Solution {
    public double factorial(int L)
    {
        double fact = 1.0;
        for(int j =1;j<=L;j++)
            fact = (fact * j) % 1000000007;
        return fact;
    }
    public int countPermutations(int[] complexity) {
        int L = complexity.length;
        
        int flag=0;
        for(int i =1 ;i<L;i++)
        {   flag = 0;
            for(int j=0;j<i;j++)
            {
                if(complexity[j] < complexity[i])
                {flag = 1;break;}
            }
            if(flag == 0)
            break;
        }
        if(flag == 0)
        return 0;
        else
        return (int)factorial(L-1);

    }
}