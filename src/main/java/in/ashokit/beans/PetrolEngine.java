package in.ashokit.beans;

public class PetrolEngine implements IEngine {
   
	
	
	public PetrolEngine() {
		super();
		System.out.println("Petrol Engine 0-Constructor");
	}

	public int start() {
		System.out.println("Petrol Engine Started.....");
		return 1;
	}

}
