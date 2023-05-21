package in.ashokit.beans;

public class DieselEngine implements IEngine {
	
	
	

	public DieselEngine() {
		super();
		System.out.println("Diesel Engine 0-constructor ");
	}

	public int start() {
		System.out.println("Diesel Engine start..");
		return 1;
	}

}
