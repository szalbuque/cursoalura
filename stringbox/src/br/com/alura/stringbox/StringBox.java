package br.com.alura.stringbox;

import java.util.Random;

public class StringBox {

	public StringBox() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Remove a letra que está na posição p da palavra.
	 * @param String palavra
	 * @param int p
	 * @return String novaPalavra
	 */
	public String Remove(String palavra, int p) {
		String novaPalavra ="";
		for (int i=0;i<palavra.length();i++) {
			if (i!=p) {
				novaPalavra = novaPalavra+palavra.charAt(i);
			}
		}
		return novaPalavra;
	}
	
	/**
	 * Embaralha as letras da string palavra de forma aleatória.
	 * @param palavra
	 * @return novaPalavra
	 */
	public String Embaralha(String palavra) {
		Random random = new Random();
		String novaPalavra = "";
		int j;
		int tamOrig = palavra.length();
		int tamPal = tamOrig;
		for (int i=0;i<tamOrig;i++) {
			j = random.nextInt(tamPal);
			novaPalavra = novaPalavra + palavra.charAt(j);
			palavra = this.Remove(palavra,j);
			tamPal = palavra.length();
		}
		return novaPalavra;
	}
	
	/**
	 * Retorna true se palavra for palíndroma
	 * @param palavra
	 * @return boolean
	 */
	public boolean EhPalindromo(String palavra) {
		boolean resultado = false;
		int tam = palavra.length();
		int j = tam-1;
		int max = (tam/2)-1;
		int iguais = 0;
		if (!palavra.trim().isEmpty()) {
			for (int i=0;i<=max;i++) {
				if (palavra.charAt(i)==palavra.charAt(j)) {
					iguais++;
				}
				j--;
			}
			if (iguais==tam/2) {
				resultado=true;
			}
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		
		return "Objeto da Classe StringBox";
	}

	/**
	 * Retorna um array contendo, em cada posição, uma letra da palavra pal
	 * @param pal
	 * @return
	 */
	public char[] toArray(String pal) {
		char[] letras = new char[pal.length()];
		for (int i=0; i<pal.length();i++) {
			letras[i]=pal.charAt(i);
		}
		return letras;
	}
	
	

}
