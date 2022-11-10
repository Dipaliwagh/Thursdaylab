package javapracticals;

import java.util.Scanner;

public class PerfectNumLab {

	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int i;
		
		for ( i=1;i<50;i++)
		{
			sum=0;
		
			for(int j=1;j<i;j++)
			{
			if(i%j==0)
			{
				sum=sum +i;
			}
			
			}
		if(sum==i)
			System.out.println(sum+" is a perfect Number");
		
		}
			
	}
}


	


