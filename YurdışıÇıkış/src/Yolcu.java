
public class Yolcu implements  Rule {
	private int ıd;
	private String name;
	private int harc;
	private boolean vize;
	
	 public Yolcu(int ıd,String name,int harc,boolean vize) {
		// TODO Auto-generated constructor stub
		 
		 this.harc = harc;
		 this.ıd = ıd;
		 this.name = name;
		 this.vize = vize;
		 
		 
	}
	

	@Override
	public boolean harcDurumuSorgulama() {
		// TODO Auto-generated method stub
		
		if(harc==0) {
			System.out.println("Harc Borcunuz Yoktur.");
			return false;
			}
			else  {
				System.out.println("Harc borcunuz " + harc+ "vardır.");
				
			}
			return true;
		}
		
	

	@Override
	public boolean vizeDurumuSorgulama() {
		// TODO Auto-generated method stub
		
		if(vize==true) {
			
			System.out.println("Vizeniz vardır.");
			
			return true;
			
		}else 
			
			System.out.println("Vizeniz yoktur.");
		return false;
		
	}
	

}
