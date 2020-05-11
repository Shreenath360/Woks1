package Basic.org.example;

import java.util.Scanner;

public class NprimeNumbers { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int status=1;
		int num=3;
		System.out.println("enter the value N:");
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		if(n>=1)
			System.out.println("first"+n+"numbers:");
		System.out.println(2);
	
	for(int i=2;i<=n;)
	{
		for(int j=2;j<=Math.sqrt(num);j++)
		{
			if(num%j==0)
			{
				status=0;
				break;
			}
		 }
        if ( status != 0 )
        {
           System.out.println(num);
           i++;
        }
        status = 1;
        num++;
     }    
		}
	}

