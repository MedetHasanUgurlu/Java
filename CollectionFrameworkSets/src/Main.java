
import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1  = new LinkedHashSet<String>();
		
		set1.add("Metehan");
		set1.add("Medet");
		
		Set<String> set2  = new LinkedHashSet<String>();
		
		set2.add("Melike");
		set2.add("Kudret");
		set2.add("Metehan");
		set2.add("Medet");
		
		
		Set<String> fark = new HashSet<String>(set2);
		//System.out.println(fark.toString());
		
		System.out.println(fark.removeAll(set1));
		System.out.println(fark.toString());
		
		
		
		
		
		
		
		
	
		
		
				

	}

}
