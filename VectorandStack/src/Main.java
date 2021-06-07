import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List<String> list = new Vector<String>();
		
		list.add("Medet");
		
		list.add(1,"Hasan");
		
		
		for(String element : list) {
			
			System.out.println(element);
			
			*/
			Stack<Integer> stack = new Stack<Integer>();
			
			stack.push(1);
			stack.push(4156);
			stack.push(23);
			stack.push(7);
			
			stack.push(9);
			
			
			Enumeration<Integer> enumeration = stack.elements();
			
			
			
			
			/*
			while(enumeration.hasMoreElements()) {
				
				stack.pop();
				
				
			}*/
			
			System.out.println(stack.isEmpty()); 
			
		}
		
		
		
		

	}


