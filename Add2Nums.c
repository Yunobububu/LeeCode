//add two numbers without +
#include <stdio.h>
void main()
{
    int a,b;
   scanf("%d,%d",&a,&b);
   printf("The sum of a&b is:%d\n",add(a,b));
}
int add(int x,int y)
{
    int sum,carry;
    if(y==0)
        return x;
    sum=x^y;
    carry=(x&y)<<1;
    return add(sum,carry);

}
