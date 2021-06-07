import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ELMA");
		arrayList.add("ERİK");
		arrayList.add("KİRAZ");
		arrayList.add("ARMUT");
		yazdır(arrayList);

		
		

	}
	public static void yazdır(ArrayList<String> arrayList) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			System.out.println("Element "+ (1+i)+ " "+arrayList.get(i));
			
		}
		
		
		
	}

}
