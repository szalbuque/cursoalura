//coleta o conteúdo digitado no campo de filtragem
var campoFiltro = document.querySelector("#filtrar-tabela");

//adiciona o evento de escuta de digitação ao campo de filtragem
campoFiltro.addEventListener("input", function() {
    var pacientes = document.querySelectorAll(".paciente");

    //se alguma coisa foi digitada, o tamanho do campo será maior que zero
    if (this.value.length > 0) {
        //se alguma coisa foi digitada, deixa todas as linhas invisíveis
        for (var i = 0; i < pacientes.length; i++) {
            var paciente = pacientes[i];  
            //captura o conteúdo do nome do paciente i  
            var tdNome = paciente.querySelector(".info-nome");
            var nome = tdNome.textContent;  
            //cria uma expressão regular que vai permitir a busca pelo conteúdo do campo de filtragem, case insensitive
            var expressao = new RegExp(this.value, "i");      
            if (expressao.test(nome)){
                //se o nome do paciente i combinar com o conteúdo da expressão, remove a classe invisível
                paciente.classList.remove("invisivel");
            } else {
                //se não combinar, adiciona a classe invisível
                paciente.classList.add("invisivel");
            }
                
        }
    } else {
        //se nada foi digitado, remove a classe invisível de todas as linhas
        for (var i = 0; i < pacientes.length; i++) {
            var paciente = pacientes[i];
            paciente.classList.remove("invisivel");
        }
    }
});