import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		/*
		System.out.println("Enter a number");
		
		int value =  scanner.nextInt(); 
		
		while(value != 5){
			System.out.println("Enter a number");
			value =  scanner.nextInt(); 
		}
		*/
		//More effective way of doing it below,
		//notice value is being declared outside of brackets-->effects all of code
		
		int value = 0;
		do {
			System.out.println("Enter a number");
			value =  scanner.nextInt(); 
		}
		while(value != 5);
		
		System.out.println("Got 5!");
	}
	
}
