public class Solution {
    public int climbStairs(int n) {
        int a=1,b=1,sum=0,i=2;
        if(n<2)
            return 1;
        for(i=2;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;

    }
}
