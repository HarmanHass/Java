//Create a method called displayHighScorePosition
//it should have a players name as a parameter,  and a 2nd parameter as a position in the high score table.
//you should display the players name along with a message like " managed to get into position " and the position 
//they got and a further message " in the high score table "
// 
//Create a 2nd method called calculateHighScorePosition
//it should be send one argument only, the player score
//it should return an int
//the return data should be 
//1 if the score is >1000
//2 if the score is >500 and <1000
//3 if the score is >100 and <500
//call both methods and display the results of the following
//a score of 1500, 900, 400




public class Test3 {
	
	public static void main(String[] args) {
	
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition(" Tyreese ", highScorePosition);
		
		 highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition(" Stan ", highScorePosition);
		
		 highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Michael Weston", highScorePosition);
	}
		
		public static void displayHighScorePosition(String playerName, int highScorePosition){
			System.out.println(playerName + " managed to get into position " + highScorePosition + 
					" on the high score table");
		}
		public static int calculateHighScorePosition(int playerScore){
			if(playerScore >= 1000){
				return 1; 
			} else if (playerScore >= 500 && playerScore <1000){
				return 2;
			}else if (playerScore >= 100 && playerScore < 500){
				return 3;
			}else {
				return 4;
			}
		}
		
	}

