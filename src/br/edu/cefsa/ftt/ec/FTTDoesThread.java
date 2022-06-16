package br.edu.cefsa.ftt.ec;

import java.util.Date;

public class FTTDoesThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		System.out.println(new Date());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new Date());
		
		Thread t1 = new Thread(new RunForestRun("Thread 1: "), "t1");
		Thread t2 = new Thread(new RunForestRun("Thread 2: "), "t2");
		Thread t3 = new Thread(new RunForestRun("Thread 3: "), "t3");

		t1.start();
		t2.start();
		t3.start();
*/
		/*
		VaiCorinthians core1 = new VaiCorinthians();
		VaiCorinthians core2 = new VaiCorinthians();
		
		core1.start();
		core2.start();

		System.out.println("Concorrência...");
		*/
		
		Pilha p = new Pilha();
		
		p.putElement(10);
		p.putElement(5);
		p.putElement(23);
		
		System.out.println(p.getElement());
		System.out.println(p.getElement());
		System.out.println(p.getElement());

	}

}
