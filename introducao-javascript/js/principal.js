var titulo = document.querySelector(".titulo");
titulo.textContent = "Aparecida Nutricionista";

var pacientes = document.querySelectorAll(".paciente");

for (i=0; i< pacientes.length;i++){
	//pega todos os dados do paciente i
	var paciente = pacientes[i];
	//tdPeso recebe toda a linha onde está a classe info-peso de paciente
	var tdPeso = paciente.querySelector(".info-peso");
	// peso recebe o conteúdo que interessa, que é o valor do peso do paciente
	var peso = tdPeso.textContent;
	var tdAltura = paciente.querySelector(".info-altura");
	var altura = tdAltura.textContent;
	// selecionando a coluna do IMC
	var tdImc = paciente.querySelector(".info-imc");
	var imc = peso / (altura * altura);
	// o conteúdo da coluna imc do paciente é substituído pelo imc calculado
	tdImc.textContent = imc.toFixed(2);
	if (peso <= 0 || peso >= 1000 ){
		console.log("peso inválido");
		tdImc.textContent = 'peso inválido';
		paciente.classList.add('paciente-invalido');
	}
	if (altura <=0 || altura >=3.00){
		console.log("altura inválida");
		tdImc.textContent = 'altura inválida';
		paciente.classList.add('paciente-invalido');
	}
}
//Captura o elemento do botão de adicionar paciente
var botaoAdicionar = document.querySelector("#adicionar-paciente");
//Define a ação que será executada quando o usuário clica no botão de adicionar paciente
botaoAdicionar.addEventListener("click", function() {
	event.preventDefault();
    // captura o formulário do HTML
    var form = document.querySelector("#form-adiciona");
    // captura o conteúdo de cada campo do formulário HTML
    var nome = form.nome.value;
    var peso = form.peso.value;
    var altura = form.altura.value;
    var gordura = form.gordura.value;
    // cria um elemento Table Row (tr) e atribui à variável pacienteTr
    var pacienteTr = document.createElement("tr");
    // cria elementos de dados Table Data (td) e associa às variáveis nomeTd, pesoTd, alturaTd e gorduraTd
    var nomeTd = document.createElement("td");
    var pesoTd = document.createElement("td");
    var alturaTd = document.createElement("td");
    var gorduraTd = document.createElement("td");
    var imcTd = document.createElement("td");
    // atribui o conteúdo de cada campo do formulário ao elemento da tabela correspondente
    nomeTd.textContent = nome;
    pesoTd.textContent = peso;
    alturaTd.textContent = altura;
    gorduraTd.textContent = gordura;
    // associa os Td´s à linha da tabela criada: pacienteTr
    pacienteTr.appendChild(nomeTd);
    pacienteTr.appendChild(pesoTd);
    pacienteTr.appendChild(alturaTd);
    pacienteTr.appendChild(gorduraTd);
    // associa a variável tabela ao elemento tabela-pacientes do HTML
    var tabela = document.querySelector("#tabela-pacientes");
    // inclui uma linha na tabela com o conteúdo da linha moontada: pacienteTr
    tabela.appendChild(pacienteTr);
});
});