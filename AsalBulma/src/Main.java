import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		
		for (int i = 1; i < 1000; i++) {
			if(AsalMı(i)) {
				System.out.println(i);
				
			}
			
			
		}
		
		 
	
		

	}
	
	
	public static boolean AsalMı(int sayı) {
		
		for (int i = 2; i < sayı; i++) {
			if (sayı%i==0) {
				
				return false;
				
				
			}
			
			
			
			
		}
		return true;
	
	
		
	}
	

}
