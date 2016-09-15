//Reverse the string end with the"#"£¬use the method of Recursion
#include<stdio.h>
main()
{
    ReverseString();
    return 0;
}
ReverseString()
{
    char ch;
    scanf("%c",&ch);
    if(ch!='#')
        {
            ReverseString();
            printf("%c",ch);
        }

}
