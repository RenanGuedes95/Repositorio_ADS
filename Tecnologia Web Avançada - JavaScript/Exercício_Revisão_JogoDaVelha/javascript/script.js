let hash = document.querySelectorAll("td");
let informacoesGame = document.querySelector("p");
let resetButton = document.getElementById("reset");
let jogadas = 0;
let jogador = 1;

informacoesGame.innerText = 'Bem vindo ao jogo da velha:';
informacoesGame.innerText += '\nO jogador 01 é o primeiro a jogar...';

hash.forEach(casa => {
    casa.addEventListener('click', event => {
        if (event.target.innerText == '') {
            if (jogadas % 2 == 0) {
                jogador++;
                informacoesGame.innerText = "É a vez do jogador " + jogador;
                event.target.innerText = "O";
            } else {
                jogador--;
                informacoesGame.innerText = "É a vez do jogador " + jogador;
                event.target.innerText = "X";
            }
            jogadas++;
            if(jogadas==9){
                verificaResultado(hash);
            }
        }
    });
})

limparCasas(hash);

function limparCasas(hash) {
    resetButton.addEventListener("click", event => {
        event.preventDefault();
        hash.forEach(casa => {
            casa.innerText = '';
            informacoesGame.innerText = 'Bem vindo ao jogo da velha:';
            informacoesGame.innerText += '\nO jogador 01 é o primeiro a jogar...';
            jogadas = 0;
            jogador = 1;
        })
    }
    )
};

function verificaResultado(hash){
    if(hash[0].innerText == hash[1].innerText && hash[1].innerText == hash[2].innerText)
    {
        if(hash[0].innerText == 'O'){
        informacoesGame.innerText = "O Jogador 01 ganhou";
        }else{
        informacoesGame.innerText = "O Jogador 02 ganhou";
        }
    }else if(hash[3].innerText == hash[4].innerText && hash[4].innerText == hash[5].innerText){
        if(hash[3].innerText == 'O'){
            informacoesGame.innerText = "O Jogador 01 ganhou";
            }else{
            informacoesGame.innerText = "O Jogador 02 ganhou";
            }
    }else if(hash[6].innerText == hash[7].innerText && hash[7].innerText == hash[8].innerText){
        if(hash[6].innerText == 'O'){
            informacoesGame.innerText = "O Jogador 01 ganhou";
            }else{
            informacoesGame.innerText = "O Jogador 02 ganhou";
            }
    }
}