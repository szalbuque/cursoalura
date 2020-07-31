package br.com.alura.testasbox;

import java.util.ArrayList;
import br.com.alura.stringbox.LetrasArray;

public class TestaArrayList {

		public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add("palavra");
		lista.add(12);
		LetrasArray la = new LetrasArray();
		la.AddLetra('a');
		la.AddLetra('x');
		lista.add(la);
		
		for (Object o:lista) {
			System.out.println("objeto: "+o);
		}
	}

}
