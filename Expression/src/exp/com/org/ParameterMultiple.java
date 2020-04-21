package exp.com.org;
interface multipara{
	int add(int a,int b);
}

public class ParameterMultiple {
public static void main(String[] args) {
	multipara ad=(a,b)->(a+b);
	System.out.println(ad.add(10, 25));
	
	multipara ad1=(int a,int b)->(a+b);
	System.out.println(ad1.add(100, 20));
}
}
