
public class Friend {
	
	String name;
	static int numberOfFriends;
	public Friend(String name) {
		this.name = name;
		numberOfFriends++;
			
	}
	public static void WriteNumberOfFriends() {
		System.out.println("You have " +numberOfFriends+ " friends.");
		
		
	}
	
	
	
	


}
	
	


