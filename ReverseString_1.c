//print a string in a reverse way
#include<stdio.h>
main()
{
    char str[20];
    char *p;
    int i=0;
    gets(str);
    printf("The original string is:%s\n",str);
    p=str;
    while(*p++);
    p-=2;
    printf("The reverse  string is:");
    while(p>=str)
        {
            printf("%c",*p);
            p--;
        }


    return 0;
}
