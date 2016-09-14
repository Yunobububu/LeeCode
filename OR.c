//swap a&b without temp
#include <stdio.h>

void swap1(int x,int y)
    {
        x=x^y;
        y=y^x;
        x=y^x;
    }
void swap2(int x,int y)
    {
        int temp;
        x=temp;
        x=y;
        y=temp;
    }
void swap3(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
    }
main()
{
   int a=3,b=4;
   swap1(a,b);
   printf("First method: %d,%d\n",a,b);
   swap2(a,b);
   printf("Second method: %d,%d\n",a,b);
   swap3(a,b);
   printf("Third method: %d,%d\n",a,b);


}
