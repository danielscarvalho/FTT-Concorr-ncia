package br.edu.cefsa.ftt.ec;

public class VaiCorinthians extends Thread {

	public VaiCorinthians() {
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		for (int c = 0; c <100; c++) {
			System.out.println(this.toString() + " Vai Corinthians!! - " + c );
		}
	} //run

}
