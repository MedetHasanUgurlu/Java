
public class Vehicle {
	
	double speed;
	String color;
	
	public Vehicle(Car car) {
		speed = car.speed;
		
		
	}
	public Vehicle(Bicycle bicycle) {
		
		
		
	}
	public Vehicle() {
		
		
		
	}
	
	
	public void Transport() {
		
		System.out.println("Vehicle transport the subject A to B with " + speed +" speeds.");
	}
	

}
