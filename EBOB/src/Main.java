import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Number A");
		int a = scan.nextInt();
		System.out.println("Number B");
		int b = scan.nextInt();
		System.out.println(ebob(a,b));
		

	}
	
	public static int ebob(int x,int y) {
		int ebob =0;
		
		for (int i = 1; i <=x && i<=y ; i++) {
			if(x%i ==0 && y%i ==0) {
				ebob =i;
				
			}
			
			
		}
		return ebob;
		
		
		
		
	}

}
