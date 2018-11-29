
public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setmodel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("porsche") || validModel.equals("gt3")){
			this.model = model;
		}else{
			this.model = "unknown";
		}
	}
	
	public String getmodel() {
		return this.model;
	}

	/*public void setEngine(String engine){
		this.engine = engine;
	}
	
	public String getEngine(){
		return this.engine;
	}
	*/
	
	
}
