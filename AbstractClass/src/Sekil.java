
public abstract class Sekil {
	
	private String isim;
	
	
	
	public Sekil(String isim) {
		
		this.isim = isim;
		
	}
	
	public void getObjectTypeName() {
		
		System.out.println("Objenin ismi: "+ isim);
		
	}
	
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	abstract void alanHesapla();
	

	
	
	

}
