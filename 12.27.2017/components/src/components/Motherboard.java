package components;

public class Motherboard {
	
	private String model;
	private String manufactureer;
	private int ramSlots;
	private int cardslots;
	private String bios;
	
	public Motherboard(String model, String manufactureer, int ramSlots, int cardslots, String bios) {
		super();
		this.model = model;
		this.manufactureer = manufactureer;
		this.ramSlots = ramSlots;
		this.cardslots = cardslots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName){
		System.out.println("Program "+ programName + " is now loading... ");
	}

	public String getModel() {
		return model;
	}

	public String getManufactureer() {
		return manufactureer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardslots() {
		return cardslots;
	}

	public String getBios() {
		return bios;
	}
	
	
	
	
}
