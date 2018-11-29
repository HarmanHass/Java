
public class Main {

	public static void main(String[] args) {
		
		// Challenge.
		//Start with a base class of a a vehicle, then create a car class that inherits from this base class
		//Finally, create another class, a specific type of car that inherits from the car class. 
		//you should be able to hand steering, changing gears, and moving (speed)
		//you will want to decide where to put the appropriate state and behaviours (fields and methods)
		//As mentioned above, changing gears, increasing/decreasing speed should be included.
		//For your specific type of vehicle you will want to add something specific for that type of car
		
		Outlander outlander = new Outlander(36);
		outlander.accelerate(30);
		outlander.accelerate(20);
		
	}

}
