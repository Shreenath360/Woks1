package app.com.prft;

/*Complete the  code to print whether the  number is weird or not  Weird
If  is odd, print Weird
If  is even and in the inclusive range of  2to5 , print Not Weird
If  is even and in the inclusive range of  6to 20, print Weird
If  is even and greater than 20	, print Not Weird*/

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		int num;
		System.out.println("enter a number:");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if (num%2!=0)  // if the number is odd.
		{
			  System.out.println("weird");
			} 
		else if (num%2==0 && num<=5) // if the number is even and in the inclusive range of 2 to 5.
			{
			  System.out.println("it is Not Weired");
			}
	
			else if (num%2==0 && num>=6 && num<=20) //if the number is even and in the inclusive range of 6 to 20.
			{
				  System.out.println("it is Weired");
				}
		
			else if(num%2==0 && num>20)  //if the number is even and the number greater than 20.
			{
			  System.out.println("Not Weired");
			}
			
	}

}
