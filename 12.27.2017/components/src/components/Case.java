package components;

public class Case {
	private String model;
	private String manufacturer;
	private String powersupply;
	private Demensions demensions;
	
	public Case(String model, String manufacturer, String powersupply, Demensions demensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powersupply = powersupply;
		this.demensions = demensions;
	}
	
	public void pressPowerButton(){
		System.out.println("power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowersupply() {
		return powersupply;
	}

	public Demensions getDimensions() {
		return demensions;
	}
	
	
	
	
}
