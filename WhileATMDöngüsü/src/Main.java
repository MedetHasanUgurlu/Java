import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 10000;
		
		
		while(true) {
		
			
			String islemler ="1***Add\n"+"2***Delete\n"+"3***Dısplay\n"+"1***Exit\n";
			System.out.println(islemler);
			System.out.println("**********************");
			System.out.println("işlem seçiniz");
			Scanner scan = new Scanner(System.in);
			int islem = scan.nextInt();
			
			if (islem ==1) {
				System.out.println("Eklenecek parayı girin");
				int eklenecekMoney =scan.nextInt();
				money =money + eklenecekMoney;
				System.out.println("Güncel Bakiye"+ money);
				
				
				
				
			} else if(islem == 2) {
				
				System.out.println("Çekılecek parayı girin");
				int cekilenMoney =scan.nextInt();
				money = money- cekilenMoney;
				System.out.println("Güncel Bakiye"+ money);
				
				
			} else if (islem == 3) {
				System.out.println("para miktarı"+ money);
				
				
				
			}else {
				System.out.println("Sistemden çıkılıyor");
				break;
				
			}
				
			
			
			
		}
		
		System.out.println("");

	}

}
