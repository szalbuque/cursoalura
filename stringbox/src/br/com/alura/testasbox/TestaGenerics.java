package br.com.alura.testasbox;

import java.util.ArrayList;
import br.com.alura.stringbox.LetrasArray;

public class TestaGenerics {
	public static void main (String[] args) {
	//neste Array somente podem ser adicionadas Strings
	ArrayList<LetrasArray> lista = new ArrayList<>();
	LetrasArray la = new LetrasArray();
	la.AddLetra('m');
	lista.add(la);
	System.out.println(lista);
	}

}
