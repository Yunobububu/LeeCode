//swap a&b without template
#include <stdio.h>
main()
{
    int a=5,b=10;
    a=a^b;
    b=b^a;
    a=b^a;
    printf("%d\n",a);
}
