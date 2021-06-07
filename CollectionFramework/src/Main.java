import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		zamanHesapla(linkedList);
		zamanHesapla(arrayList);
		
		

	}
	public static void zamanHesapla(List<Integer> list) {
		
		long baslangic;
		long bitis;
		
		baslangic = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			
			list.add(i);
			
		}
		
		bitis = System.currentTimeMillis();
		
		
		System.out.println(bitis-baslangic+"GECEN SÜRE");
		
	}

}
