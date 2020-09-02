package exp.com.org;
interface state
{
	String say(String message);
}
public class StatementsMultiple {

	public static void main(String[] args) {
state st= (message)->
{
	String str1="hi hello";
	String str2= str1+message;
	return str2;
};
System.out.println("how are you");
	}

}
