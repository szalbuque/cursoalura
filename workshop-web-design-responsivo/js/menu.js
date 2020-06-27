// captura o clique no botão Abrir Menu, do documento html e adiciona a classe menu-ativo a este documento
document.querySelector('.menu-abrir').onclick = function() {
    document.documentElement.classList.add('menu-ativo');
};

//captura o clique no botão Fechar Menu, na barra de navegação do documento HTML e remove a classe
//menu-ativo deste documento
document.querySelector('.menu-fechar').onclick = function() {
    document.documentElement.classList.remove('menu-ativo');
};

//captura o click no documento principal, para fechar o menu flutuante
document.documentElement.onclick = function(event) {
    if (event.target === document.documentElement) {
        document.documentElement.classList.remove('menu-ativo');
    }
};