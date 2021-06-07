import java.util.Scanner;

public class Account {
	private String kullanici_Adi;
	private String parola;
	private int bakiye;
	
	
	public Account(String kullanici_Adi,String parola,int bakiye) {
		this.kullanici_Adi = kullanici_Adi;
		this.parola = parola;
		this.bakiye = bakiye;
		
	}
	
	public void paraYatır() {
		System.out.println("Yatıralcak miktarı giriniz");
		Scanner scanner = new Scanner(System.in);
		
		int tutar = scanner.nextInt();
		bakiye += tutar;
		System.out.println("Yeni Bakiye "+ bakiye);
		
	}
	public void paraCek() {
		System.out.println("Cekilecek miktarı giriniz");
		Scanner scanner = new Scanner(System.in);
		
		int tutar = scanner.nextInt();
		if(tutar>bakiye) {
			System.out.println("Yeterli bakiye yok.");
			
		}else {
		bakiye -= tutar;
		System.out.println("Yeni Bakiye "+ bakiye);
		}
		
	}
	
	
	


	public String getKullanici_Adi() {
		return kullanici_Adi;
	}


	public void setKullanici_Adi(String kullanici_Adi) {
		this.kullanici_Adi = kullanici_Adi;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}


	public int getBakiye() {
		return bakiye;
	}


	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
	
	

}
