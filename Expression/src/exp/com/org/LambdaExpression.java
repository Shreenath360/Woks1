package exp.com.org;
interface drawing
{
	public void draw();
}
public class LambdaExpression {
	public static void main(String[] args) {
		
	
	int width=10;
drawing d2=()->
{
	System.out.println("writing"+width);
};
d2.draw();
}
}