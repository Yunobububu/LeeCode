//Reverse the words of the string
#include<stdio.h>
main()
{
    char str[50];
    printf("Please input the string:\n");
    gets(str);
    printf("The original string is:%s\n",str);
    Reverse_String(str);
    printf("The reverse  string is:%s",str);
    return 0;
}
Reverse_String(char *s)
{
    if(!s||!*s)
        return s;
    char *p,*q;
    p=s;
    q=s;
    while(*q!='\0')
    {
        if(*q==' ')
        {
            Reverse_Word(p,q-1);
            q++;
            p=q;
        }
        else
            q++;
    }
    Reverse_Word(p,q-1);
    Reverse_Word(s,q-1);
    return s;
}

Reverse_Word(char *m,char *n)
{
        char *temp;
        while(n>m)
        {
            temp=*m;
            *m++=*n;
            *n--=temp;

        }
}
