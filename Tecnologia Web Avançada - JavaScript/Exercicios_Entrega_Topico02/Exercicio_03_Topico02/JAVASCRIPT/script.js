var expressao = (5-2) && (5 - ' ') && (5-2);
//Neste caso, pelo fato do operador lógico ser && (and) é comparado se uma expressão E outras são verdadeiras e sendo todas verdadeiras o valor mostrado será o do último valor true, ou seja, o resultado da subtração no último parenteses, que será o numeral 3.
console.log(expressao);