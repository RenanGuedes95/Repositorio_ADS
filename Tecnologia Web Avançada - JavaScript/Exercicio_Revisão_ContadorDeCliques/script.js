/*Exercício 2: Criando um contador de cliques 
Objetivo: criar um contador de cliques usando JavaScript e manipulação do DOM.*/
let botao = document.querySelector("#click-me");
let clique = document.getElementById("counter");
let cliques = 0;
botao.addEventListener("click", () =>{
    clique.innerText = cliques++;   
});