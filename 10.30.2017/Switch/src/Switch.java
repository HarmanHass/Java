
public class Switch {

	public static void main(String[] args) {
		/*int value = 12;
		if(value == 1) {
			System.out.println("Value was 1 ");
		}else if(value == 2){
			System.out.println("Value was 2 ");
		}else{
			System.out.println("Was not 1 0r 2");
		}*/
	
		int switchValue = 4; 
		
		switch(switchValue){
			case 1:
				System.out.println(" Value was 1");
				break;
			case 2: 
				System.out.println("Value was 2");
				break;
			case 3:case 4: case 5:
				System.out.println("was a 3, or 4 or 5 ");
				System.out.println("Actually it was a " + switchValue);
				break;
				
			default:
				System.out.println("Was not 1 or 2");
				break;
		}
		
		String month = "January"; 
		switch(month){
		case "January":
			System.out.println("Jan");
			break; 
		case "Feb":case"March":case"April":
		System.out.println("Not feb or march or april");
		break;
		}
		
		
		
		
		
	}
}
