import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "Traning moves \n"+
					"Mekik \n"+
					"Sinav\n"+
					"Barfiks\n"
					;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Mekik sayısını gir");
		int a = scanner.nextInt();
		System.out.println("Sinav sayısını gir");
		int b = scanner.nextInt();
		System.out.println("Barfiks sayısını gir");
		int c = scanner.nextInt();
		Idman idman = new Idman(a,b,c);
		
		
		if(idman.bittiMi()==true) {
			System.out.println("Tebrikler idmanınız bitti");
			
		}else {
			
			System.out.println("idmanınız bitmedi");
		}
		

	}

}
