import java.util.Scanner;

public class Login {
	public Login() {
		
	}
	
	public Login(Account account) {
		Scanner scanner = new Scanner(System.in);
		String userName;
		String password;
		boolean log;
		System.out.println("Give the userName");
		String uncheckedUserName = scanner.next();
		System.out.println("Give the passWord");
		String uncheckedPassword = scanner.next();
		
		
		
	
		
		
		if(account.getKullanici_Adi().equals(uncheckedUserName)&account.getParola().equals(uncheckedPassword)) {
		System.out.println("Succesful login");
		log = true;
				
		}else {
			System.out.println("Wrong UserName or Password");
			log  = false;
			
		}
		
		
		
		
	}
	public  boolean login(Account account) {
		Scanner scanner = new Scanner(System.in);
		String userName;
		String password;
		System.out.println("Give the userName");
		String uncheckedUserName = scanner.next();
		System.out.println("Give the passWord");
		String uncheckedPassword = scanner.next();
		
		
		
	
		
		
		if(account.getKullanici_Adi().equals(uncheckedUserName)&account.getParola().equals(uncheckedPassword)) {
			return true;
		}else {
			System.out.println("Wrong UserName or Password");
			return false;
		
		}
		
		
		
		
	
		
		
		
	}
	
	
	
	

	
		
		
		
		
	
	
	
	
	
}
