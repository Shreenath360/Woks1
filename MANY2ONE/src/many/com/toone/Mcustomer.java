package many.com.toone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity  
public class Mcustomer {

	  
	    @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  
	    private int m_id;  
	    private String m_name;  
	      
	    @ManyToOne  
	    private Supermarket market;

		public int getM_id() {
			return m_id;
		}

		public void setM_id(int m_id) {
			this.m_id = m_id;
		}

		public String getM_name() {
			return m_name;
		}

		public void setM_name(String m_name) {
			this.m_name = m_name;
		}

		public Supermarket getMarket() {
			return market;
		}

		public void setMarket(Supermarket market) {
			this.market = market;
		}


}
