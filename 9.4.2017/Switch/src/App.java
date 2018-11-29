//ex: Create a new switch state using char
//create a new char variable 
//create a switch statement test for 
//A, B, C, D, OR E
//display a message if any of these are found and then break
//add a default which displays a message saying not found


public class App {

	public static void main(String[] args) {
		char value = 'H'; 
		
		switch(value){
		case 'A':
			System.out.println("Char was A");
			break;
		case 'B':
			System.out.println("char was B");
			break;
		case 'C': 
			System.out.println("Char was C");
			break;
		case 'D': case 'E': case'F': 
			System.out.println(value + "was found");
			break; 
		default:
			System.out.println("Char wasnt found");
			break;
		}
		String month = "January"; 
		switch(month.toLowerCase()){
			case "january":
				System.out.println("Jan");
				break;
			case "june":  
				System.out.println("June");
				break;
			default: 
				System.out.println("Idk!");
				break; 
		}
		
	}

}
