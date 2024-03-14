function ehPar(numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

cantarMusica(10);

function cantarMusica(quantidade) {
    var primeiraEstrofe = '', segundaEstrofe = '';
    for (var i = 1; i <= quantidade; i++) {
        if (!ehPar(i)) {
            if (i == 1) {
                primeiraEstrofe = `1 Elefante incomoda muita gente`;
            } else {
                primeiraEstrofe = `${i} Elefantes incomodam muita gente...`;
            }
            console.log(primeiraEstrofe);
        } else if (ehPar(i)) {
            segundaEstrofe = `${i} Elefantes `;
            for (var j = 1; j <= i; j++) {
                segundaEstrofe += `incomodam, `
            }
            segundaEstrofe += `muito mais...`
            console.log(segundaEstrofe);
        };
    }

    for (var i = quantidade; i >= 1; i--) {
        if (ehPar(i)) {
            primeiraEstrofe = `${i} Elefantes incomodam muita gente...`;
            console.log(primeiraEstrofe);
        } else if (!ehPar(i)) {
            if (i == 1) {
                segundaEstrofe = `1 Elefante incomoda muito menos...`;
            } else {
                segundaEstrofe = `${i} Elefantes `;
                for (var j = i; j >= 1; j--) {
                    segundaEstrofe += `incomodam, `
                }
                segundaEstrofe += `muito menos...`
            }
            console.log(segundaEstrofe);
        };
    }
}
