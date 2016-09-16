//reverse a string without using extra space
//in-place revesrse
#include<stdio.h>
void main()
{
    char str[20];
    printf("Please input the String\n");
    gets(str);
    Reverse_String2(str);
    //Reverse_String3(str,0,strlen(str));
    puts(str);
    return 0;
}

 Reverse_String(char *p)//without using var
{
    char *s,*q;
    s=p;
    q=p;
    while(*p++)
    {
        q++;
    }
    q-=1;
    while(q>s)
    {
        *q=*s^*q;
        *s=*q^*s;
        *q=*s++^*q--;
    }
    return s;

}
Reverse_String2(char *p)//use temp var
{
    char *s,*q,temp;
    s=p;
    q=p;
    while(*(p+1)!='\0')
    {
        q++;
        p++;
    }
    while(q>s)
    {
        temp=*q;
        *q--=*s;
        *s++=temp;
    }
    return s;
}
Reverse_String3(char *p,int left,int right)
{
    char temp;
    char *s;
    *s=*p;

    if(left>=right)
        return;

    s[left]=temp;
    s[left]=s[right];
    s[right]=temp;
    Reverse_String3(s,left++,right--);

}
