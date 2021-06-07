import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Give the weight");
			
			double a = scan.nextInt();
			
			System.out.println("Give the Height");
			
			double b = scan.nextInt();
			
			
			if (a*b>30000) {
				System.out.println("Fat");
				
			}
			else if(a*b<3000) {
				System.out.println("Weak");
				
				
			} else 
				System.out.println("NORMAL");
		}
		
		
		
		

	}

}
