#include<stdio.h>


void main()
{
    char *s[100]={0};
    char *t[100]={0};
    gets(s);
    gets(t);
    canConstruct(s,t);
}
 canConstruct(char *ransomNote,char *magazine)
{
    int i=0,j=0,lens1=0,lens2=0;
    char c[30]={0};
    while(*(magazine+i))
    {
        c[*(magazine+i)-96]=c[*(magazine+i)-96]+1;
        i++;
        lens1++;
    }
    while(*(ransomNote+j))
    {
        j++;
        lens2++;
    }
    if((lens1<lens2)||(lens1==0))
        return false;
    if(lens2==0)
        return true;
    i=0;
    while(((c[*(ransomNote+i)])!=0)&&(i<lens1))
        {
            c[*(ransomNote+i)]=c[*(ransomNote+i)]-1;
            i++;
        }
    if(i==lens2)
        return true;
    else
        return false;

}
