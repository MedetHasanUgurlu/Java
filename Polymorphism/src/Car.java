
public class Car implements V {
	private String carName;
	private int year;
	
	public Car(String carName,int year) {
		this.carName = carName;
		this.year = year;
		
		
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println(carName+ "is going");
		
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
		

}
