package br.edu.cefsa.ftt.ec;

import java.util.Date;

public class RunForestRun implements Runnable {
	
	private String name = "Thead X: ";
	private int loopVal = 100;

	public RunForestRun() {
		// TODO Auto-generated constructor stub
	}
	
	public RunForestRun(String name) {
		this.name = name;
	}
	
	public void run() {
		
		for (int i=0; i < this.loopVal ; i++) {
			//System.out.println(Thread.currentThread().getName() + new Date());
			System.out.println(this.name + new Date());
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	} //run

}
