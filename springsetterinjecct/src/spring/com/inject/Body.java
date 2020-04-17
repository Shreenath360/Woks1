package spring.com.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Human man=context.getBean("exam",Human.class);
		man.startpumb();
		
	}
}
