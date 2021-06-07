import java.util.Scanner;

public class Idman {
	int sınav;
	int mekik;
	int barfiks;
	
	
	public Idman(int sınav,int mekik,int barfiks) {
		this.barfiks =barfiks;
		this.mekik = mekik;
		this.sınav = sınav;
		
		
	}

	public boolean bittiMi() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Ypılan mekik sayısnı gir");
		int yapılanmekiksayısı = scan.nextInt();
		mekik-=yapılanmekiksayısı;
		
		System.out.println("Ypılan Sinav sayısnı gir");
		int yapılanSinavsayısı = scan.nextInt();
		
		System.out.println("Ypılan Barfiks sayısnı gir");
		int yapılanBarfikssayısı = scan.nextInt();
	
		if (mekik<=0) {
			System.out.println("Tebrikler istenilen Mekik sayısına ulaştuınız");
			
		}else {
			System.out.println("Kalan mekik sayısı"+ mekik);
			
		}
		
		
		return false;
	}
	
	
	

}
