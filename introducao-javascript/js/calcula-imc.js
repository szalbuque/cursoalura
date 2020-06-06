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
	var imc = calculaImc(peso,altura);
	var pesoEhValido = validaPeso(peso);
	var alturaEhValida = validaAltura(altura);
	// o conteúdo da coluna imc do paciente é substituído pelo imc calculado
	tdImc.textContent = imc;
	if (!pesoEhValido ){
		console.log("peso inválido");
		tdImc.textContent = 'peso inválido';
		paciente.classList.add('paciente-invalido');
	}
	if (!alturaEhValida){
		console.log("altura inválida");
		tdImc.textContent = 'altura inválida';
		paciente.classList.add('paciente-invalido');
	}
}

function calculaImc(peso, altura) {
	var imc = peso / (altura * altura);
	return imc.toFixed(2);
}

function validaAltura(altura){
    if (altura >= 0 && altura <= 3.0){
            return true;
    } else {
            return false;
    }
}

function validaPeso(peso){
    if (peso >=0 && peso <= 1000){
        return true;
    } else {
        return false;
    }
}