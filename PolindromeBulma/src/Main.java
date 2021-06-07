import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cümle giriniz");
		
		String cumle = scanner.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		
		for(int i =0;i<cumle.length()/2;i++) {
			
			stack.push(cumle.charAt(i));
			
			
			
		}
		
		
		

	}
	/*
	public static boolean isPolindrome(Stack<String> stack,String cumle)  {
		
		
		for
		
		
		
		
		
	}
	*/
}
