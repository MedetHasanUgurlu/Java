import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerandConsumer {
	Random random = new Random();
	Queue<Integer> list = new LinkedList<Integer>();
	
	Object key = new Object();
	
	private int limit =7;
	
	public void produce() {
		
	
			while(true) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (key) {
				if(list.size()<=limit) {
					int a = random.nextInt(100);
					
					list.offer(a);
					
					System.out.println("Uretilen miktar :"+ a);
					System.out.println("Array boyu "+ list.size());
					key.notify();
					
				}
				try {
					key.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				}
			}
		
		
		
	
	}
	
	public void consume() {
		while(true) {
			
				try {
					Thread.sleep(3000);
					key.wait();
					synchronized (key) {
					if(list.size()>=0) {
						key.notify();
						int a = list.peek();
						list.poll();
						System.out.println("Tuketilen miktar "+ a);
						System.out.println("Arrayin boyutu "+list.size());
						
					}
					
					
					}	
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
				
			}
			
			
			
			
			
		
		}
		
		
		
	
	}
	
	

	
	
	
	  
	
	


