
public class test4 {

	public static void main(String[] args) {
		int newScore =calculateScore(" Big Man ", 100);
		System.out.println("new score is " + newScore);
		calculateScore(13);
		calculateScore();
	}
	public static int calculateScore(String playerName, int score){
		System.out.println("player " +playerName + " scored " + score + " points ");
		return score * 1000; 
	}
	
	public static int calculateScore(int score){
		System.out.println("unnammed player scored " + score + " points ");
		return score * 1000; 
	}
	public static int calculateScore(){
		System.out.println("No player name, no player score");
		return 0; 
	}

}
