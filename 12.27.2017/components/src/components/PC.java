package components;

public class PC {
	private Case theCase;
	private minitor minitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, components.minitor minitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.minitor = minitor;
		this.motherboard = motherboard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public minitor getMinitor() {
		return minitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	
	
	
}
