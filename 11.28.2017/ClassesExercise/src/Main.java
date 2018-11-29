
/* 
-Create a new class for a bank account 
-Create fields for the account number,balance, customer name, email and phone number

-Create getters and setter for each field
-Create 2 additional methods 
- 1. to allow the customer to deposit funds(this should increment the balance field)
-2. to allow the customer to withdraw funds. This should deduct from the balance field,
but not allow the withdrawal to complete if their are insufficient funds.
-your will want to create various code in the Main class(source->generate code->gettersAndsetters)to
confirm your code is working
-add some sysout in the 2 methods above as well. 

*/

public class Main {

	public static void main(String[] args) {
		
		Account bobsAccount = new Account(); 
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
	} 

}
