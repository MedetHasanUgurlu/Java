import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer  {

	Random random = new Random();
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(15);
	
	
	public void produce() {
		try {
			while(true) {
			Thread.sleep(1000);
			int a = random.nextInt(5);
			System.out.println(a+" eleman ekleniyor.");
			queue.put(a);
			
			}	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void consume() {
		try {
			while(true) {
			Thread.sleep(3000);
			System.out.println(queue.peek()+"Eleman cikariliyor.");
			queue.take();
			
			}	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
