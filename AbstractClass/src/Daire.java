
public class Daire extends Sekil {
	
	private int yarıCap;

	public Daire(String isim,int yarıCap) {
		super(isim);
		this.yarıCap = yarıCap;
		// TODO Auto-generated constructor stub
	}

	@Override
	void alanHesapla() {
		// TODO Auto-generated method stub
		System.out.println("Dairenin alanı"+ Math.PI*yarıCap*yarıCap);
		
		
		
	}

}
