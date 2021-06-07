
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("Volvo",2015);
		Bicycle b1 = new Bicycle("Orange", 158214);
		
		
		V[] Vehicles = {b1,c1};
		
		for (V v : Vehicles) {
			v.go();
		}
		

	}

}
