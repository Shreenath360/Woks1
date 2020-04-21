package exp.com.org;
 interface material
{
	public String say(String name);
}
public class ParameterSingle {
	public static void main(String[] args) {
material s1 =(name)->
{
	return "hello,"+name;
};
System.out.println(s1.say("harry"));
material s2= (name)->
{
return "hello,"+name;	
	};
	System.out.println(s2.say("potter"));
	}

}
