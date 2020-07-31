package br.com.alura.testasbox;

import br.com.alura.stringbox.StringBox;

public class TestaStringBox {

	public TestaStringBox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String palavra1 = "aamaa";
		String palavra2 = "aa";
		String palavra3 = "roma";
		String palavra4 = "a";
		StringBox sb = new StringBox();
//		System.out.println(palavra1 + " - "+sb.EhPalindromo(palavra1));
//		System.out.println(palavra2 + " - "+sb.EhPalindromo(palavra2));
//		System.out.println(palavra3 + " - "+sb.EhPalindromo(palavra3));
//		System.out.println(palavra4 + " - "+sb.EhPalindromo(palavra4));
		
		String pal = "abacate";
		System.out.println(sb.Embaralha(pal));
		
		//exibe o conteúdo formatado no método toString()
		//que foi sobrescrito na classe StringBox
		System.out.println(sb);
		
		char[] letras = sb.toArray(pal);
		for (int i=0; i<letras.length;i++) {
			System.out.println("letras["+i+"] = "+letras[i]);
		}
		
		
		
		//cria array com caracteres da palavra (array com tipo primitivo)
//		char[] letras = new char[palavra1.length()];
//		for (int i=0; i<palavra1.length();i++) {
//			letras[i]=palavra1.charAt(i);
//			System.out.println("letras["+i+"] = "+letras[i]);
//		}
		
		//cria array com referências para objetos StringBox
		StringBox[] sbs = new StringBox[3];
		StringBox sb2 = new StringBox();
		StringBox sb3 = new StringBox();
		sbs[0] = sb;
		sbs[1] = sb2;
		sbs[2] = sb3;
		for (int i=0;i<sbs.length;i++) {
			System.out.println(sbs[i]);
		}
		
		//cria array com lista
		int[] inteiros = {1,2,3,4,5};
		for (int i=0;i<inteiros.length;i++) {
			System.out.println(inteiros[i]);
		}
		
	}
	

}
