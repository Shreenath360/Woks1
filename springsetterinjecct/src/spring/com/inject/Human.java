package spring.com.inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	@Autowired
	@Qualifier("human1")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startpumb()
	 {
		 heart.pump();
		 System.out.println("name of the animal is:" +heart.getNameofanimal()+" noof hreat:" +heart.getNoheart());
	 }
	
}