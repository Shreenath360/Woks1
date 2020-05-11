package Basic.org.example;

import java.util.Scanner;

public class PerfecctSquare {
static boolean checkPerfectSquare(double x)
{
	double sq = Math.sqrt(x);
	return ((sq - Math.floor(sq)) == 0);
	
}
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner (System.in);
		double num= sc.nextDouble();
		sc.close();
		if (checkPerfectSquare(num))
		{
			System.out.println(num+"the number is a perfect Square");
		}
		else
		{
			System.out.println(num+"the number is not a square");
		}
			
	}

}
