
public class Main {
	public static void main(String[] args) {
		WaitNotify waitNotify = new WaitNotify();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				waitNotify.thread1Fonksiyonu();

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				waitNotify.thread2Fonksiyonu();

			}
		});
		
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
