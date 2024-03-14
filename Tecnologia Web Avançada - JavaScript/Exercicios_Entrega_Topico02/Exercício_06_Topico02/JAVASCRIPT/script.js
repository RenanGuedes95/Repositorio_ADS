if(('Gato' === 'gato') && (5 > 2)) {  
    console.log('Verdadeiro');
} else {  
    console.log('Falso');
}

//Neste caso, a primeira verificação é false porque o sinal de '===' representa o idêntico, como o javaScript é uma linguagem case sensitive ele faz diferença entre maiúsculas e minúsculas, com isso 'Gato' e 'gato' não são strings idênticas. Portanto, será mostrado 'Falso', visto que, no operador lógico && quando é encontrado o primeiro valor false, ele imprime o mesmo e não finaliza a verificação das condicionais restantes.
