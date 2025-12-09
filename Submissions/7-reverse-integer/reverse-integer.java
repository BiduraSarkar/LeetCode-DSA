class Solution {
    public int reverse(int x) {
        int sign = 1;
        if( x < 0)
        sign = -1;
        int copy = x > 0 ? x : -x;
        int digit;
        long sum = 0L;
        while(copy != 0)
        {
            digit = copy % 10;
            sum = sum*10 + digit;
            copy = copy/10;
        }
        if( sum >= (int)Math.pow(-2,31) && sum <= (int)Math.pow(2,31)-1)
        return sign*(int)sum;
        else 
        return 0;

    }
}