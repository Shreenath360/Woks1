package many.com.one;

	import javax.persistence.Entity;

	import javax.persistence.Id;

	@Entity
	public class Channel {

		@Id

		private int C_id_;

		private String C_name;

		public Channel(int C_id,String C_name)

		{

			super();

			this.C_id_=C_id;

			this.C_name=C_name;
		}

		public Channel() {

			super();

		}

		public int getC_id_() {
			return C_id_;
		}

		public void setC_id_(int c_id_) {
			C_id_ = c_id_;
		}

		public String getC_name() {
			return C_name;
		}

		public void setC_name(String c_name) {
			C_name = c_name;
		}


		 	}

