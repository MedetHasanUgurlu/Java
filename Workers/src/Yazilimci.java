
public class Yazilimci extends Calisan{
	String diller;
	
	public Yazilimci(int id,String name,String surName, String diller) {
		super(id,name,surName);
		this.diller = diller;
		
		
	}
	public void formatAt() {
		System.out.println("Format atılıyor");
		
	}
	public void display() {
		super.display();
		System.out.println("Bildigi diller" +diller);
		
	}

		
		
	}


