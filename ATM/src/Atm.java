import java.util.Scanner;

public class Atm {
	public void run(Account account) {
		
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		
		
		int girisHakki =3;
		System.out.println("Welcome");
		
		while(true) {
		if(	login.login(account)) {
			System.out.println("Kullanıcı Girişi Doğru");
			break;

		}
		else {
			System.out.println("Kullanici girisi Hatali");
			girisHakki --;
			System.out.println("Giris Hakki  "+ girisHakki);
			
		}
		
		if (girisHakki ==0) {
			System.err.println("Sistem Kapaniyor.");
			System.exit(0);
			
		}
		}
		String islemler = "1-Para Sorgulama"+"2-Para Cekme"+"4-Cıkıs"+"3-Para ekle";
		System.out.println(islemler);
		int key = scanner.nextInt();
		while(true) {
		switch (key) {
		case 1: {
			System.out.println("Bakiyeniz "+account.getBakiye());
			break;
			
		} 
		case 2: {
			
			account.paraCek();
			
		} 
		case 3: {
			
			account.paraYatır();
		} 
		case 4: {
			break;
			
		} 
		}
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
