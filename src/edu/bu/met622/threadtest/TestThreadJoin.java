package edu.bu.met622.threadtest;

//Illustrating join()
public class TestThreadJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				for (int j=0 ; j<100; j++) {
					System.out.println("t111111");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int j=0 ; j<100; j++) {
					System.out.println("t222222");
				}
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				for (int k=0 ; k<100; k++) {
					System.out.println("t333333");
				}
			}
		};
		t1.start();
//		t1.sleep(1000);
		t2.start();
		t3.start();
//		Lets comment and uncomment t2.join and see the differences.
//		t2.join();
		System.out.println("End");
	}
}
