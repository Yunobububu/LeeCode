//find the missing number
#include<stdio.h>
#include<stdlib.h>
main()
{
    int MissNum=0,i=0,S=0,T=0,N;
    int *Pnum=NULL;
    printf("Please input the 0~N number N:\n");
    scanf("%d",&N);
    Pnum=(int *)(malloc(sizeof(int)*N));
    for(i=0;i<N;i++)
    {
        scanf("%d",Pnum+i);
        S^=*(Pnum+i);
        T^=i;
    }
    MissNum=S^T^i;
    printf("The Missing number is:%d\n",MissNum);
    free(Pnum);
    return 0;
}
