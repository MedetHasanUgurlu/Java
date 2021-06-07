
public class ThreadSafe {
	private int count;
	public synchronized void arttir() {
		count++;
		
	}
	
	public void ThreadleriCalistir() {
		Thread sad = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			for(int i =0 ;i<5000;i++) {
				arttir();
				
				
			}	
				
				
				
				
			}
		});
		
		
		Thread das = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i =0 ;i<5000;i++) {
					arttir();
					
					
				}	
					
				
			}
			
			
		});
			
		
		sad.start();
		das.start();
		
		try {
			sad.join();
			das.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(count);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafe threadSafe = new ThreadSafe();
		threadSafe.ThreadleriCalistir();
	
		
		


	}

}
