
public class VipPerson {

	private String name; 
	private double creditLimit;
	private String emailAddress;
	
	public VipPerson(){
		this("default name", 5000.0, "default@email.com");
	}
	
	public VipPerson(String name, double creditLimit) {
		this(name, creditLimit, "unknown@email.com");
	}


	public VipPerson(String name, double creditLimit, String emailAddress) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	public String getName(){
		return name;
	}
	public double getCreditLimit(){
		return creditLimit;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
}
