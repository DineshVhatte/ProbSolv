
public class BankForm {
	
	private String name;
	private String lastName;
	private int accNumber;
	
	
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {
		BankForm object = new BankForm();
		object.setName("Shruti");
		object.setLastName("Vhatte");
		object.setAccNumber(100);
		//System.out.println("Name: "+object.getName()+"\n"+"LastName: "+object.getLastName()+"\nAccount Number:"+object.getAccNumber());
		System.out.println("h");

	}

}
