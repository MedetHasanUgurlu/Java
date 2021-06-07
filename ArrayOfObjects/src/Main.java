import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Food> x = new ArrayList<Food>(); 
		
		Food f1 = new Food("Bread");
		Food f2 = new Food("Water");
		Food f3 = new Food("Juice");
		x.add(f1);
		x.add(f2);
		x.add(f3);
		
		
		for (Food food : x) {
			System.out.println(food.name);
		}
		
		
		Food [] foods = new Food[3];
		foods[0] = f1;
		foods[1] = f2;
		foods[2] = f3;
		
		for (Food food : foods) {
			
			System.out.println(food.name);
			
		}


		
		

	}

}
