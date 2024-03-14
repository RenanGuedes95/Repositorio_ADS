var quantidade;
while(quantidade == undefined || isNaN(quantidade) || quantidade <= 0){
    quantidade = prompt("Digite a quantidade de vezes que a música será repetida: ");
}
if(quantidade % 2 != 0){
    quantidade++;
}
musicaElefante(quantidade);
function musicaElefante(numeroDeVezes) {
    var letra;
    for (var i = 1; i <= numeroDeVezes; i += 2) {
        if (i == 1) {
            letra = (`1 Elefante incomoda muita gente...`);
        } else {
            letra = (`${i} Elefantes incomodam muita gente...`);
        }
        letra += (`
${i + 1} Elefantes`);
        for (var j = 0; j <= i; j++) {
            letra += ` incomodam,`
        }
        letra += " muito mais...";
        console.log(letra);
    }
    for (var i = numeroDeVezes; i >= 1; i -= 2) {
        letra = (`${i} Elefantes incomodam muita gente...`);
        if (i - 1 == 1) {
            letra += (`
1 Elefante incomoda muito menos...`);
            console.log(letra);
            break;
        }
        letra += (`
${i - 1} Elefantes`);
        for (var j = i - 1; j >= 1; j--) {
            letra += ` incomodam,`
        }
        letra += " muito menos...";
        console.log(letra);
    }
}