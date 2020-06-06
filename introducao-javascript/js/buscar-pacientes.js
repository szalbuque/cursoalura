//captura dados de pacientes de um JSON

var botaoAdicionar = document.querySelector("#buscar-pacientes");

botaoAdicionar.addEventListener("click", function() {
	//cria e configura um objeto de requisição HTML
	var xhr = new XMLHttpRequest();
    xhr.open("GET", "https://api-pacientes.herokuapp.com/pacientes");
    //adiciona ao objeto de requisição um evento de escuta e define o que será executado quando chegar a resposta da requisição
    xhr.addEventListener("load", function() {
    	var erroAjax = document.querySelector("#erro-ajax");
    	if (xhr.status == 200){
    		//deu tudo certo
    		//deixa invisivel a mensagem de erro
    		erroAjax.classList.add("invisivel");
    		var resposta = xhr.responseText;
            //a função JSON.parse identifica os objetos que estão no texto de resposta da requisição e devolve no tipo adequado
            //nesse caso, vai devolver um array de objetos do tipo paciente
            var pacientes = JSON.parse(resposta);
            pacientes.forEach(function(paciente) {
           	 	adicionaPacienteNaTabela(paciente);
       	 	});
    	} else {
    		//deu algum erro
    		//deixa aparecer a mensagem de erro
    		erroAjax.classList.remove("invisivel");
    		console.log("Erro ao carregar os dados")
    	};
            
    });
    //envia a requisição
    xhr.send();
   

});