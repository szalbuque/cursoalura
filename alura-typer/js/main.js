//var frase = $(".frase").text();
//console.log (frase);
//var numPalavras = frase.split(" ").length;
//console.log (numPalavras);
//var tamanhoFrase = $("#tamanho-frase");
//tamanhoFrase.text(numPalavras);

//Pega o campo da textarea
var campo = $(".campo-digitacao");
//à medida que o usuário digita, executa a função
campo.on("input", function() {
	//Pega o conteúdo da textarea
	var conteudo = campo.val();
	//Calcula a qtde de palavras usando uma expressão regular: spaces plus
	//Subtrai 1 para corrigir o valor quando o usuário apaga e reescreve
	var qtdPalavras = conteudo.split(/\S+/).length - 1;
	//Substitui o total de palavras na tag html contador-palavras
	$("#contador-palavras").text(qtdPalavras);
	//Pega o tamanho do conteudo
	var qtdCaracteres = conteudo.length;
	//Substitui o total de caracteres na tag html contador-caracteres
	$("#contador-caracteres").text(qtdCaracteres);
});