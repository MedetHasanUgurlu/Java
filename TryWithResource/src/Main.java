import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try(FileWriter writer = new FileWriter("dosya.txt",true)) {
			while(true) {
			System.out.println("Bir dil giriniz");
			String s = sc.nextLine();
			writer.write(s+"\n");
			
			if(s.equals("-1")) {
				
				System.out.println("Sistemden cıkılıyor");
				System.out.println("Iyi gunler");
				break;
				
			}
			
			}
			
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Dosya acılırken bir hata olustu.");
		}

	}

}
