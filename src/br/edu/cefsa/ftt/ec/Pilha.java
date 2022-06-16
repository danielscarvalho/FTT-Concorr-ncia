package br.edu.cefsa.ftt.ec;

import java.util.ArrayList;

public class Pilha {
	//FIFO
	
	ArrayList<Integer> dados = new ArrayList<Integer>();

	public Pilha() {
		// TODO Auto-generated constructor stub
	}
	
	public int getElement() {
		int elemento = -1;
				
		if (!dados.isEmpty()) {
			elemento = dados.get(0);
			dados.remove(0);
		}
		
		return elemento;
	}
	
	public void putElement(int elemento) {
		dados.add(elemento);
	}

}
