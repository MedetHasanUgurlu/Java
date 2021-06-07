import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<String> quene = new LinkedList<String>();
		quene.offer("Java");
		quene.offer("Php");
		quene.offer("Phyton");
		quene.poll();
		quene.poll();
		System.out.println(quene.peek());
		
	


	}

}
