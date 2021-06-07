import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = new  ArrayList<String>();
		Set<String> set = new LinkedHashSet<String>();
		
		
		
		list.add("Java");
		list.add("Php");
		list.add("Phyton");
		list.add("C#");
		
		
		
		
		ListIterator<String > iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
		
		
		
		
		
		

	}

}
