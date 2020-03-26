package jpa.com.test;

	import javax.persistence.Entity;

	import javax.persistence.Id;

	import javax.persistence.OneToOne;
@Entity
	public class Card {

		@Id

		private int voter_id;
		
		@OneToOne
		private User user;
	
		public Card( int voter_id, String c_name, User user) {

		super();

			voter_id = voter_id;

			this.user = user;

		}
		
		
	public Card()
	{
		
	}

		public int getVoter_id() {
			return voter_id;
		}

		public void setVoter_id(int voter_id) {
			this.voter_id = voter_id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		
	

}
