import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeYaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogrenci o1 = new Ogrenci("Medet", 571);
		Ogrenci o2 = new Ogrenci("Hasan", 974);
		
		
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"));
			Ogrenci[] ogrenci_Array = {o1,o2}; 
			ArrayList<Ogrenci> list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_Array));
			
			out.writeObject(ogrenci_Array);
			out.writeObject(list);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
