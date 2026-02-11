int strStr(char* haystack, char* needle) {

int l = strlen(haystack);
int l2 = strlen(needle);
int i=0,j=0;
while(i < l)
{
    if(haystack[i] == needle[0])
    {   int temp = i; 
        while( j < l2 && haystack[i] == needle[j])
        {
            j++;
            i++;
        }
        if(j == l2)
        return temp;
        else
        {i = temp;j=0;}
    }
    i++;

}

return -1;

}