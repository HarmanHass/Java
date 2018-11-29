
public class app {

	public static void main(String[] args) {
		// byte
		// short
		// int
		// int 
		// long
		// float
		// double
		// char
		// boolean
		
		String myString = "This is a string";  
		System.out.println("myString is equal to: " + myString);
		myString = myString + ", and this is more."; 
		System.out.println("myString is equal to: " + myString);
		
		String numberString = "250.55"; 
		numberString = numberString + "49.55";
		System.out.println("The result is " + numberString);
		
		/*What happendss is that the string converts the int into a string
		 resulting the console to print 1050 & no calculations
		*/
		String lastString = "10"; 
		int myInt = 50; 
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);

	}

}
