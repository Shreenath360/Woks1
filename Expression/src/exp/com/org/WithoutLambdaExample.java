package exp.com.org;
 interface Drawable
 {
public void draw();
}
public class WithoutLambdaExample {
	public static void main(String[] args) {
		int width=10;
		Drawable da= new Drawable() {
			public void draw() {System.out.println("drawing"+width);}
		};
		da.draw();
}
}