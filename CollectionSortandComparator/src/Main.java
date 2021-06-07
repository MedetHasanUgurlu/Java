import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;






public class Main {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(21);
		list.add(1);
		list.add(3);
		list.add(25);
		list.add(39);
		list.add(0);
		
		
		
		List<Player> playerList = new ArrayList<Player>();
		
		playerList.add(new Player("Medet"));
		playerList.add(new Player("Hasan"));
		playerList.add(new Player("asdasd"));
		playerList.add(new Player("klşlşk"));
		playerList.add(new Player("qweqwe"));
		playerList.add(new Player("xzczx"));
		
		
		Collections.sort(playerList, new buyukkucuk());
		
		for (Player player : playerList) {
			
			System.out.println(player);
			
		}
		//Collections.sort(list);
		/*Collections.sort(list,new a());
		
		for (Integer string : list) {
			
			System.out.println(string);
			
		}*/

	}

}


 class a implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
	
}
 
 
 class buyukkucuk implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.getName().compareTo(o2.getName())<0 ) {
			
			return -5;
			
			
		} else 
		return 5;
	}
	 
	 
	 
	 
 }
 
 class Player{
	 
	 private String name;
	 public Player(String name) {
		 
		 this.name = name;
		 
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
	
	 
	 
	 
 }
