//Move Zeros
#efine sizeNum 10
#include<stdio.h>
void main()
{
    int a[sizeNum]={1,0,5,1,4,3,0,2,0,10};
    int sizeNum,i;
    MoveZeros(a,sizeNum);
    return 0;

}
MoveZeros(int *a,int length)
{
    int *p,*q,i=0,j;
    p=a;
    q=a;
    while((*q!=0)&&(i<=length))
        {
            i++;
            q++;
            p++;
        }

    if(i>length)
    {
        printf("There is no zero in the array\n");
        return -1;
    }
    for(j=0;j<length-i;j++)
    {
        if(*(p+j)!=0)
            {

                *q=*(p+j);
                q++;
            }
        *(p+j)=0;

    }
    for(i=0;i<length;i++)
        printf("%d ",a[i]);



}
