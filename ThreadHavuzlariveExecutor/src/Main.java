public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread1 = new Thread(new Worker("Medet", 1));
		Thread thread2 = new Thread(new Worker("Hasan", 2));
		Thread thread3 = new Thread(new Worker("MELİKE", 3));
		Thread thread4 = new Thread(new Worker("METEHAN", 4));
		Thread thread5 = new Thread(new Worker("KUDRET", 5));
		
		
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		thread3.start();
		thread4.start();
		
		try {
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		thread5.start();
	

	}

}
