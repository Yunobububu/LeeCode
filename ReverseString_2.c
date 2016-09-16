//print a string in a reverse way
#include<stdio.h>
#include<string.h>
main()
{
    char *str[20];
    char *p;
    int i=0;
    gets(str);
    printf("The original string is:%s\n",str);
    p=str;
    i=strlen(str);
    printf("The reverse  string is:");
    while(i>0)
    {
        printf("%c",*(p+i-1));
        i--;
    }
    return 0;
}
