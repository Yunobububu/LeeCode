package Leecode.ImpInJava;

//House Robber
//when num={};num.length error!!!how to solve it?
public  class Test{
	public static void main(String[] args){

		int[] num={12,34,2,12,4,5};

		System.out.printf("%d", Solution(num));

	}
	public static int Solution(int[] num){
		int i=0;

		if(num==null)
			return 0;

			int[] dp=new int[num.length+1];
			dp[0]=0;
			dp[1]=num[0];
			if(num.length==1)
			{
				return dp[1];
			}


				for(i=2;i<=num.length;i++)
				dp[i]=Math.max((dp[i-2]+num[i-1]),dp[i-1]);
				return dp[num.length];

	}
}
