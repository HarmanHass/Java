
public class Main {

	public static void main(String[] args) {
//		Account bobsAccount = new Account();
//		System.out.println(bobsAccount.getNumber());
//		System.out.println(bobsAccount.getBalance());
		
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		
		VipPerson person2 = new VipPerson("bob", 250000); 
		System.out.println(person2.getName());
		
		VipPerson person3 = new VipPerson("Harman", 100.0, "Harman@email.com");
		System.out.println(person3.getName());
	}

}

/*

Create a new class VipCustomer
it should have 3 fields name, credit limit and email address
create 3 constructors 
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
3rd constructor should save all fields
create getters
*/