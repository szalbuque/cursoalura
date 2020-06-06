//captura todos os pacientes que estão na tabela da página, usando a classe paciente
var pacientes = document.querySelectorAll(".paciente");
//captura a tabela inteira
var tabela = document.querySelector("table");

//Adiciona o escutador de eventos à tabela e captura o elemento da tabela que foi clicado
tabela.addEventListener("dblclick",function(event){
	console.log("alvo do duplo clique: "+event.target);
	console.log("quem foi clicado: "+this);
	var alvoEvento = event.target;
	var paiDoAlvo = alvoEvento.parentNode;
	//animando a exclusão com fadeOut de 0.5s - ver classe fadeOut
	event.target.parentNode.classList.add("fadeOut");
	setTimeout(function(){paiDoAlvo.remove();},500);
});

