import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        while (true){
            String s = in.nextLine();
            
            
            if(s.equals("Read me until end-of-file."))
            break;
            
        }
        System.out.println("You are out in the game.");
        in.close();

	}

}
