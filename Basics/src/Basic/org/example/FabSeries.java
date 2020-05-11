package Basic.org.example;

public class FabSeries {

	public static void main(String[] args) {
int count=10, num1=0, num2=1;
System.out.println("fab series of"+count+"numbers");
for(int i=1;i<=count;i++)
{
	System.out.println(num1+"");
	int SumOfPrevTwo= num1+num2;
	num1=num2;
	num2= SumOfPrevTwo;
}
	}

}
