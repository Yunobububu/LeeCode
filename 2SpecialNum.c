//Find the special two numbers:
#include<stdio.h>
#include<stdlib.h>
main()
{
    int num1=0,num2=0;
    int final_num=0,i=0,j=0,flag=0,temp=0,N;
    int *Pnum;
    printf("Please input the N numbers:\n");
    scanf("%d",&N);
    Pnum=(int *)(malloc(sizeof(int)*N));
    for(i=0;i<N;i++)
    {
        scanf("%d",Pnum+i);
        final_num^=*(Pnum+i);

    }
    while(!(final_num&1))//find the  location that num1 diff from num2 that equal to 1
    {
        flag++;          // from the rightmost bit to find
        final_num>>1;
    }
    for(i=0;i<N;i++)
    {
        temp=*(Pnum+i);
        temp>>flag;
        if(temp&1)//dispatch num1,num2 to different group
            num1^=*(Pnum+i);
        else
            num2^=*(Pnum+i);
    }
    printf("The two special numbers are:%d,%d",num1,num2);
    free(Pnum);
    return 0;

}
