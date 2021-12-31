// To find the fibonacci series upto n-terms using DP approach. It can be done using any approaches.
import java.util.*;
public class fibonacci
{
	public static void main(String args[])
	{
		System.out.println("Enter the range");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];// fib(n)=fib(n-1)+fib(n-2);//Bottom up approach(tabulation)
		}
		System.out.println("The fibonacci numbers are:-");
		for(int i=0;i<n;i++)
			System.out.print(dp[i]+" ");
		System.out.println("");
	}
}
