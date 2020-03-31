package many.com.toone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  

public class Supermarket {

   
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int s_int;  
private String s_name;  
  

public Supermarket(int s_int, String s_name) {  
    super();  
    this.s_int = s_int;  
    this.s_name = s_name;  
      	
}  
  
public int getS_int() {
	return s_int;
}

public void setS_int(int s_int) {
	this.s_int = s_int;
}

public String getS_name() {
	return s_name;
}

public void setS_name(String s_name) {
	this.s_name = s_name;
}

public Supermarket() {  
    super();  
}  
}
