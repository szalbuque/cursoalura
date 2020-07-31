package br.com.alura.stringbox;

public class LetrasArray {
	private int tam;
	private char[] array;
	
	public LetrasArray() {
		this.tam = 0;
		this.array = new char[10];
	}
	
	public void AddLetra(char letra) {
		array[this.tam] = letra;
		this.tam++;
	}

	public void MostraLetras() {
		for (int i=0;i<=this.tam;i++) {
			System.out.println(array[i]);
		}
	}
	
	@Override
	public String toString() {
		String retorno="";
		for (int i=0;i<=this.tam;i++) {
			retorno = retorno + " | " + array[i];
		}
		return "Objeto da Classe LetrasArray: "+retorno;
		
	}
}
