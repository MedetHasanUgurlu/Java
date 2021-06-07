import java.util.Scanner;

public class Matematik {
	
	
	public class Factorial{
		
		public void factorial() {
			int factorial =1;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Faktoriyel yapacagınız sayıyı girin");
			int sayı = scanner.nextInt();
			
			for (int i = 2; i <= sayı; i++) {
				factorial *=i;
				
			}
			System.out.println("Faktoriyel : "+factorial);
			
			
			
		}
		
		
		
	}

}
