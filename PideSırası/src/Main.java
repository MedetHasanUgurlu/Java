import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> kuyruk = new LinkedList<String>();
		
		
		kuyruk.offer("Kerem");
		kuyruk.offer("Beytullah");
		kuyruk.offer("Melih");
		kuyruk.offer("Semih");
		kuyruk.offer("Mahmut");
		kuyruk.offer("Beyza");
		kuyruk.offer("Arife");
		kuyruk.offer("Medet");
		kuyruk.offer("Melike");
		
		ekmekAlmayanlar(kuyruk, 6);
		
		
		
		

	}
	
	public static void ekmekAlmayanlar(Queue<String> kuyruk,int ekmekSayısı) {
		
		for(int i = 0;i < ekmekSayısı;i++) {
			
			
			kuyruk.poll();
			
			
		}
		
		for (String string : kuyruk) {
			System.out.println(string);
			
		}
		
		
	}

}
