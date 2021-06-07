import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		Yolcu y1 = new Yolcu(12,"Medet",165,true);

		if(y1.harcDurumuSorgulama()==false) {
			
			System.out.println("Harc borcunuz yoktur.");
			System.out.println("Vize durumunuza bakılıyor");
			
			if (y1.vizeDurumuSorgulama()== true) {
				System.out.println("Vizeniz vardır.");
				}
				else 
				{
					System.out.println("Vizeniz yoktur.");
			}
			
				
			}
			
			
			
		else {
			
			System.out.println("Harc borcunuz vardır.");
			
			
		}}}
		
		
		
		
		

	
	
	