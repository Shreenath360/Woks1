package many.com.tomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;

@Entity

public class Cars {
	@Id
			private int BMW;
	        private int Benz;
	        private int Audi;
			
			@ManyToMany(targetEntity=Customer.class)
				private List Customer;
			
			public Cars(int BMW, int Benz, int Audi, List Customer ) {  
			    super();  
			    this.BMW = BMW;  
			    this.Benz = Benz;  
			    this.Customer = Customer;  
			}  

			public Cars() {
				super();
			}

			public int getBMW() {
				return BMW;
			}

			public void setBMW(int bMW) {
				BMW = bMW;
			}

			public int getBenz() {
				return Benz;
			}

			public void setBenz(int benz) {
				Benz = benz;
			}

			public int getAudi() {
				return Audi;
			}

			public void setAudi(int audi) {
				Audi = audi;
			}

			public List getCustomer() {
				return Customer;
			}

			public void setCustomer(List customer) {
				Customer = customer;
			}

		
		

	
	}


