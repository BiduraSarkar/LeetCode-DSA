class Solution {
    public int myAtoi(String s) {
     s = s.trim();
     int L = s.length();
     int sign = 1;
     double sum =0.0;
     for(int i=0;i<L;i++)
     {
        char c = s.charAt(i);
        if(i==0 && c == '-')
        {sign = -1; continue;}
        else if(i==0 && c == '+')
        {continue;}
        else{
        int digit = c-'0';
        if(digit >=0 && digit <= 9)
        sum = sum*10 + digit;
        else
        break;
        }
     }  
     sum = sign * sum;
     if(sum >= Math.pow(-2,31) && sum <= Math.pow(2,31)-1)
     return (int)sum;
     else if(sum < (int)Math.pow(-2,31))
     return (int)Math.pow(-2,31);
     else
     return (int)Math.pow(2,31);

    }
}