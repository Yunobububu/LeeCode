//find the special number which is input only once
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *Pnum=NULL;
    int N=0,i=0,SpecialNum=0;
    printf("How many numbers you wanna input:?\n");
    scanf("%d\n",&N);
    Pnum=((int *)malloc(sizeof(int)*N));
    printf("input the numbers u wanna test:\n");
    for( i=0;i<N;i++)
    {
        scanf("%d",Pnum+i);
        SpecialNum^=*(Pnum+i);
    }
    printf("The special number is: %d\n",SpecialNum);
    free(Pnum);
    return 0;
}
