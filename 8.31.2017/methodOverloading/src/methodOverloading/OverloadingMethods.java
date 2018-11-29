package methodOverloading;

public class OverloadingMethods {

	public static void main(String[] args) {
		int newScore = calculateScore("Harman", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);  
		calculateScore(); 
		double  centermetrs = calcFeetAndInchesToCentimeters(6,9);
		if(centermetrs <0.0){
			System.out.println("Invalid parameters");
		}
		calcFeetAndInchesToCentimeters(157);
	}
	/*
	 * create a method called calcFeetAndInchesToCentimeters
	 * It needs to have two parameters.
	 * feet is the first parameter, inches is the second
	 * 
	 * you should validate that first parameter feet is >=0
	 * you should validate that 2nd parameter is >=0 and <=12
	 * return -1 from the method if either of the above is not true 
	 * 
	 * If the parameters are valid, then calculate how many centimeters comprise 
	 * the feet and inches passed to the method and return that value.
	 * 
	 * Create a 2nd method of the same name but with only 1 parameter 
	 * inches is the parameter
	 * validate that its >=0
	 * return -1 if it is not true
	 * but if its valid, then calculate how many feet are in the inches and
	 * then here is the tricky part
	 * call the other overloaded method passing the correct feet and inches 
	*/
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet <0 ) || ((inches <0 ) || (inches >12))){
			System.out.println("Invalid feet or inches parameters");
			return -1; 
		}
		
		double centimeters = (feet * 12) *2.54;
		centimeters += inches * 2.54; 
		System.out.println(feet + "feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;
	}
	public static double calcFeetAndInchesToCentimeters(double inches) {
	if(inches < 0){
		return-1; 
		}
	double feet = (int) inches / 12;
	double remainingInches = (int) inches % 12; 
	System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches ");
	return calcFeetAndInchesToCentimeters(feet, remainingInches); 
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int calculateScore(String playerName, int score){
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score){
		System.out.println("Unnamed Player " + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(){
		System.out.println("No player name, no player score.");
		return 0;
	}

}
