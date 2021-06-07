
public class WaitNotify {
	Object key = new Object();

	public void thread1Fonksiyonu() {
		synchronized (key) {

			System.out.println("Thread fonksiyonu calismaya basladi.");
			System.out.println("Uyarilmayi bekliyor.");
			try {

				key.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Thread1 uyarıldı calısmaya basladı");

		}

	}
	
	
	
	
	
	public void thread2Fonksiyonu() {
		synchronized (key) {

			System.out.println("Thread fonksiyonu calismaya basladi.");
			try {
				Thread.sleep(3000);
				System.out.println("Thread1 UYANDIRMAYA GİDİYORUM");
				key.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		

		

	}

}
	}
