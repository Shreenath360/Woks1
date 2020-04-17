package loading.com.prft;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private int reg_id;
	private String Hobbies;
	//insering the value using @value annotation
	@Value("shree")// static
	
	public void setName(String name) {
		this.name = name;
	}
	@Value("${student.reg_id}")
	@Required
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	@Value("swimming")
	@Required
	public void setHobbies(String hobbies) {
		Hobbies = hobbies;
	}
	
public void DisplayStddetails()
{
	System.out.println("name of the student:"+name);
	System.out.println("student register id:"+reg_id);
	System.out.println("hobbies of the student:"+Hobbies);
}

}

