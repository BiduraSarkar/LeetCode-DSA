class Solution {
    public boolean isPalindrome(int x) {
     if(x < 0) 
     return false;
    int s = 0;
    int copy = x;
    while( copy != 0)
    {
        s = s * 10 + copy % 10;
        copy = copy / 10;
    }
    return x == s;
    }
}