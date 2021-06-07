import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		linkedList.add("IASTANBUL");
		linkedList.add("Igdır");
		linkedList.add("Bursa");
		linkedList.add("Erzurum");
		
		
		

		ListIterator<String> iterator = linkedList.listIterator();
		listeyiBastir(linkedList);
		
		listeyiEkleSıralı(linkedList, "Erzurum");
		
		
		
		
		
		
		
		
	}
	public static void listeyiEkleSıralı(LinkedList<String> gidilecekYer, String yeni) {
		
		ListIterator<String> iterator = gidilecekYer.listIterator();
		int karsılastir = iterator.next().compareTo(yeni);
		
		while (iterator.hasNext()) {
			if (karsılastir==0) {
				System.out.println("İki deger var");
				return;
				
				
			}else if(karsılastir >0) {
				
				iterator.previous();
				iterator.add(yeni);
			
				
				
			}
			
		}
	
		
		
		
	}

	
	
	public static void listeyiBastir(LinkedList<String> gidilecekYer) {
		
		ListIterator<String> iterator = gidilecekYer.listIterator();
		
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
			
			
			
		}
		
		
		
		
	}
	

}
