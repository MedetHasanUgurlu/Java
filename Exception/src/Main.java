import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give the number for dividing.");
		int a = scanner.nextInt();
		System.out.println("Please give other the number for dividing.");
		int b = scanner.nextInt();
		
		int c = a/b;
		
		System.out.println("a/ b equal to " +c);
		} 
		catch(ArithmeticException e) {
			
			System.out.println("Invalid Math Operation");
			
			
			
		}
		

	}

}
