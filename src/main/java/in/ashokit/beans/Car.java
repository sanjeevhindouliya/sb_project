package in.ashokit.beans;

public class Car {

	public IEngine eng;

	public Car() {
		super();
		System.out.println("Car Class parameter less constructor");
	}

	public Car(IEngine eng) {
		super();
		System.out.println("Car class parameteried constructor");
		this.eng = eng;
	}
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();

		if (status >= 1) {
			System.out.println("Engine Started....");
		} else {
			System.out.println("Engine Failed....");
		}
	}

}
