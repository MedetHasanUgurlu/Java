import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            for(int i= 0 ;i<n;i++) {
            	int firstValue = (int) (a+Math.pow(2, i)*b);
            	result += firstValue;
            	
            	list.add(result);
            }
            
            
            
        
        
        System.out.println(list.toString());
        in.close();
        
	}}
		/*
		  Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)System.out.println("* byte");
	                else if(x<=32767 && x>=-32768 ){
	                    System.out.println("* short");
	                    
	                }else if(x<= Math.pow(i, x)-1 && x>=(-Math.pow(2,31)) ){
	                    System.out.println("* int");
	                    
	                } else(x<=(Math.pow(2,63)-1 && x>=(-Math.pow(2,63)) ){
	                    System.out.println("* long");
	                    
	                }
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	    }
		
		*/
		

	


