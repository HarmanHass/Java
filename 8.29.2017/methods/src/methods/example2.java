package methods;

//shows how to get the method to calculations and send back results
//send back value to method that called in the first place.
public class example2 {

	public static void main(String[] args) {
		
		boolean gameOver = true; 
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		score = 10000; 
		levelCompleted = 8; 
		bonus = 200;
		calculateScore(gameOver, score, levelCompleted, bonus);
		
	}

	public static int calculateScore(boolean gameOver, int score, int levelcompleted, int bonus){
	
		if(gameOver){
			int finalScore = score + (levelcompleted * bonus);
			finalScore += 2000; 
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		} else {
			return -1;
		}
		//or you could remove the else statement and just put return -1; 
		//outside the if statement. 
	}
	
	
	
	
	
}
