package Leecode.ImpInJava;

public class NumberOfBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int  n) {
        int num=0;
        while(n!=0)
        {
            n=n&(n-1);
            num++;
        }
        return num;
    }
}
