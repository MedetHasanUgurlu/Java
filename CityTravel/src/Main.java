import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String islemler = 	"0 - İslemleri görüntüle"+
							"1 - Bir sonraki sehre git"+
							"2 - Bir onceki sehre git"+
							"3 - Uygulamadan cık";
		
		LinkedList<String> city = new LinkedList<String>();
		city.add("Mugla");
		city.add("Mus");
		city.add("Adıyaman");
		city.add("Erzincan");
		
		display(city);
		
		
		
		
		
		
		
		

	}
	
	public static void sehirleriTurla(String forward) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		
	}
	
	
	
	public static void display(LinkedList<String> list) {
		ListIterator<String> it = list.listIterator();
		
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
	}
	

}
