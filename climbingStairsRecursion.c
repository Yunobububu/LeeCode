//DP f(n)=f(n-1)+f(n-2);
//cost too much time;
public class Solution {
    public int climbStairs(int n) {
        if(n==1||n==0)
            return 1;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
