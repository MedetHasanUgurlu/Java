import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Radyo implements Iterable<String>{
	private ArrayList<String> radyoKanallari = new ArrayList<>();
	
	public class RadyoIterator implements Iterator<String>{
		
		private int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
	
	
	public Radyo(String[] liste) {
		
		for (String string : liste) {
			System.out.println(string);
		}
		
		
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new RadyoIterator();
	}
	
	
	
	
	

}
