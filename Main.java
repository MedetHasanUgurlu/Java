
public class Main {
	public static void main(String[] args) {

		ProducerandConsumer producerandConsumer = new ProducerandConsumer();
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				producerandConsumer.produce();

			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				producerandConsumer.consume();

			}
		});
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
