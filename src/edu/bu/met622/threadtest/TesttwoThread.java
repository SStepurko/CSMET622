package edu.bu.met622.threadtest;

import edu.bu.met622.threadtest.FirstThread;
import edu.bu.met622.threadtest.SecondThread;

public class TesttwoThread {
	public static void main(String[] args) throws Exception{
		FirstThread firstT = new FirstThread() ;
		Thread i = new Thread(firstT);
		
		SecondThread secondT = new SecondThread();
		Thread j = new Thread(secondT);
		
		i.start();
		j.start();
		
		//j.join(); // j is for second thread
		
		j.sleep(500);
		
	}
}
