class Solution {
    public int romanToInt(String s) {
      if(s.length() == 0)
      return 0;

      String Symbol1[] = {"IV","IX","XL","XC","CD","CM"};
      int Value1[] = {4,9,40,90,400,900};

      String Symbol2[] = {"I","V","X","L","C","D","M"};
      int Value2[]= {1,5,10,50,100,500,1000};

      int ans = 0;

      for(int i=0;i<6;i++)
      {
        if(s.startsWith(Symbol1[i]))
        ans = ans + Value1[i] + romanToInt(s.substring(2)); 
      }

      if(ans == 0){
      for(int i=0;i<7;i++)
      {
        if(s.startsWith(Symbol2[i]))
        ans = ans + Value2[i] + romanToInt(s.substring(1)); 
      }
      }

      return ans;

    }
}