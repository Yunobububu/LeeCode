package Leecode.ImpInJava;

public class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length,k=0;
        int i=n-1;
        int[] newdigits=new int[n+1];
        while(i>=0&&digits[i]==9)
        {

            digits[i]=0;
            i--;
        }
        newdigits[0]=1;
        for(k=1;k<=n;k++)
            newdigits[k]=0;
        if(i==-1)
            return newdigits;
        digits[i]=digits[i]+1;
        return digits;


    }
}
