//Captura o elemento do botão de adicionar paciente
var botaoAdicionar = document.querySelector("#adicionar-paciente");
//Define a ação que será executada quando o usuário clica no botão de adicionar paciente
botaoAdicionar.addEventListener("click", function() {
	event.preventDefault();
    console.log('botão pressionado');
    // captura o formulário do HTML
    var form = document.querySelector("#form-adiciona");
    var paciente = obtemPacienteDoFormulario(form);
    console.log(paciente);
    var pacienteTr = montaTr(paciente);  
    var erros = validaPaciente(paciente);
    if (erros.length > 0){
        exibeMensagensDeErro(erros);
        return;
    }  
    adicionaPacienteNaTabela(paciente);
    form.reset();
    var mensagensErro = document.querySelector("#mensagens-erro");
    mensagensErro.innerHTML = '';
});

function obtemPacienteDoFormulario (form){
    // captura o conteúdo de cada campo do formulário HTML
    var paciente = {
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calculaImc(form.peso.value, form.altura.value)
    }
    return paciente;
}

function montaTr (paciente){
    // cria um elemento Table Row (tr) e atribui à variável pacienteTr
    var pacienteTr = document.createElement("tr");
    pacienteTr.classList.add("paciente");
    
    // associa os Td´s à linha da tabela criada: pacienteTr
    pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
    pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
    pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
    pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
    pacienteTr.appendChild(montaTd(paciente.imc, "info-imc"));

    return pacienteTr;
}

function montaTd(dado,classe){
     // atribui o conteúdo de cada campo do formulário ao elemento da tabela correspondente
     var td = document.createElement("td");
     td.textContent = dado;
     td.classList.add(classe);
     return td;
}

function validaPaciente(paciente){
    var erros =[];

    if (!validaPeso(paciente.peso)) erros.push("Peso é inválido.");
    if (!validaAltura(paciente.altura)) erros.push("Altura é inválida.");
    if (paciente.nome.length==0 || paciente.peso.length==0 || paciente.altura.length ==0 || paciente.gordura.length ==0){
        erros.push("Todos os campos devem estar preenchidos.");
    }

    return erros;
}

function exibeMensagensDeErro(erros){
    //exibe uma lista de erros na página HTML
    var ul=document.querySelector("#mensagens-erro");
    ul.innerHTML='';
    erros.forEach(function(erro){
        var li = document.createElement("li");
        li.textContent = erro;
        ul.appendChild(li);
    })
}

function adicionaPacienteNaTabela(paciente) {
    var pacienteTr = montaTr(paciente);
    var tabela = document.querySelector("#tabela-pacientes");
    tabela.appendChild(pacienteTr);
}