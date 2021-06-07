import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file ;
		FileInputStream reader ;
		
		try {
			file = new File("dosya.txt");
			reader = new FileInputStream(file);
			int d=0;
			
			String s = "";
			while((d =reader.read()) !=-1) {
				
				s+=(char)d;
				
			}
			System.out.println(s);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
