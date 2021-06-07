import java.util.Comparator;

public class Hasta implements Comparator<Hasta> {
	
	private String name;
	private String sikayet;
	
	private int oncelik;
	
	public Hasta(String name,String sikayet) {
		this.name = name;
		this.sikayet = sikayet;
		if(sikayet.equals("Apandisit")) {
			
			this.oncelik =3;
			
		}else if(sikayet.equals("Yanık")) {
			this.oncelik = 2;
			
			
		}else {
			
			this.oncelik = 1;
		}
	
	}

	

	@Override
	public String toString() {
		return "Hasta [name=" + name + "\n"+ ", sikayet=" + sikayet +"\n"+ ", oncelik=" + oncelik + "]";
	}



	@Override
	public int compare(Hasta o1, Hasta o2) {
		// TODO Auto-generated method stub
		if(o1.oncelik>o2.oncelik) {
			
			return -6;
		}else if(o1.oncelik<o2.oncelik) {
			return 6;
			
			
		}
		else {
			
			return 0;
		}
	}


}

	



