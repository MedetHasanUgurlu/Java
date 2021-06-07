import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeOku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"));
			
			
			Ogrenci[] ogrenci_Array = (Ogrenci[])in.readObject();
			
			ArrayList<Ogrenci> list = (ArrayList<Ogrenci>)in.readObject();
			
		for (Ogrenci ogrenci : list) {
			
			System.out.println(ogrenci);
		}

			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
