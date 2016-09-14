//swap a&b without temp
#include <stdio.h>


main()
{
   int a=3,b=4;
   swap1(&a,&b);
   printf("First method: %d,%d\n",a,b);
   swap2(&a,&b);
   printf("Second method: %d,%d\n",a,b);
   swap3(&a,&b);
   printf("Third method: %d,%d\n",a,b);

}
void swap1(int *x,int *y)//swap the address of a&b
    {
        *x=*x^(*y);
        *y=*y^(*x);
        *x=*y^(*x);
    }
void swap2(int *x,int *y)//the address of a&b return to the origin
    {
        int temp;       //use the additional temp
        temp=*x;
        *x=*y;
        *y=temp;
    }
void swap3(int *x,int *y)//swap again
    {
        *x=*x+*y;
        *y=*x-*y;
        *x=*x-*y;
    }
