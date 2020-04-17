package spring.com.inject;

public class Heart {
	private int noheart;
	private String nameofanimal;
	public int getNoheart() {
		return noheart;
	}
	public void setNoheart(int noheart) {
		this.noheart = noheart;
	}
	public String getNameofanimal() {
		return nameofanimal;
	}
	public void setNameofanimal(String nameofanimal) {
		this.nameofanimal = nameofanimal;
	}
	public void pump()
	{
		System.out.println(" your heart pumping");
		System.out.println(" alive");
		
	}

}
