
public class TheWhileAndDoWhileStatements {

	public static void main(String[] args) {
		/*
		int count = 0; 
		while(count != 6){
			System.out.println("Count value is " + count);
			count++;
		}
		
		count = 1; 
		while(true){
			if(count == 6){
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}
		
		count = 2;
		do{
			System.out.println("Count value was " + count);
			count++;
		}while(count != 9);
		*/
		
		/*				challenge 
		Create a method called isEvenNumber that takes a parameter of type int
		its purpose is to determine if the argument passed to the method is
		an even number or not.
		return true if an even number, otherwise return false.
		*/
		
		int number = 5;
		int finishNumber = 20;
		while(number <= finishNumber){
			if(!isEvenNumber(number)){
				number++;
				continue;
			}
			System.out.println("Even number " + number);
			number++;
		}
		
	}
	
	public static boolean isEvenNumber(int number){
		if((number % 2) == 0){
			return true;
		}else {
			return false;
		}
	
	}
	
	

	
	
	
}
