if(('Gato' === 'gato') || (5 > 2)) {  
    console.log('Gato' && 'Cão');
} else {  
    console.log('Falso');
}

//Neste caso, o operador lógico é o || (ou), então ele irá procurar o primeiro valor verdadeiro, que no caso acima é (5>2), dito isso, ele entrará na condicional do if, já na condicional dentro do if o operador lógico é o && (e) e como os dois são verdadeiros ele irá imprimir o último valor true encontrado, ou seja, Cão.