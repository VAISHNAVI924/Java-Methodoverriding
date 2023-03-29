package methodoverriding;

public class Vehicle extends Car {
	int id=237;
	void start() {
		super.start();
		System.out.println("vehicle is starting");
	}

}
