class Solution {
    public String intToRoman(int num) 
    {
        if(num < 10)
        {
            String Symbol1[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
            return Symbol1[num];
        }
        String Symbol2[] = {"M","CM","D","CD","C","XC","L","XL","X"};
        int Value[] = {1000,900,500,400,100,90,50,40,10};
        String ans = "";
        for(int i =0 ; i < Value.length; i++)
        {   if(num >= Value[i])
            {   ans =  Symbol2[i] +intToRoman(num - Value[i]);
                break;
            }
        } 
        return ans;  
      

    }
}