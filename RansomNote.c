#include<stdio.h>
main()
{
    char *s[100]={0};
    char *t[100]={0};
    gets(s);
    gets(t);
    canConstruct(s,t);
}
bool canXonstruct(char* ransomNote,char* magazine)
{
    int i=0,j=0,lens1,lesn2;
    char *c[250]={0};
    while(*(mangazine+i))
    {
        c[*(mangazine+i)]=c[*(mangazine)]+1;
        i++;
        lens1++;
    }
    while(*(ransomNote+j))
    {
        j++;
        lens2++;
    }
    if((lens1>lens2)||(lens2==0))
        return false;
    if(lens1==0)
        return true;
    int i=0;
        while(((c[*(ransomNote+i)])!=0)&&(i<lens1))
            {
                c[*(ransomNote+i)]=c[*(ransomNote+i)]-1;
                i++;
            }
        if(i==lens1)
            return true;
        else
            return false;





}
