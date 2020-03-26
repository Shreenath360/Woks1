package many.com.one;



import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Televission {


	@Id

	 @GeneratedValue(strategy=GenerationType.AUTO)  

	@OneToMany(targetEntity=Channel.class)

	private int id;

	private List<Channel> chan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Channel> getChan() {
		return chan;
	}

	public void setChan(List<Channel> chan) {
		this.chan = chan;
	}

	
}
