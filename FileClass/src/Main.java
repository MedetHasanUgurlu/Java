
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileReader reader = new FileReader("New Text Document.txt");
			int data = reader.read();
			
			while (data !=-1) {
			System.out.print((char)data);
			data = reader.read();
			

			}
			reader.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
		
		
		
		

	}

}
