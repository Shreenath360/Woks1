package exp.com.org;
 interface sayable
{
	public String say();
}
public class Noparameter {
	public static void main(String[] args) {
sayable sa=()->
{
return "i have nothing";
	};
	System.out.println(sa.say());
}
}
