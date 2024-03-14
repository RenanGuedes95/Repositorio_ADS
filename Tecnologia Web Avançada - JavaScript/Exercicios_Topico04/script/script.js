//Crie uma array com os anos que o Brasil ganhou a copa:
var yearsOfBrazilWins = ['1958', '1962', '1970', '2002'];
//Interaja com o array utilizando um loop, para cada anos mostrar no console a seguinte mensagem: O Brasil ganhou a copa em ANO.
yearsOfBrazilWins.forEach((ano) => {
    console.log(`O Brasil ganhou a copa de ${ano}`);
});
//Interaja com um loop nas frutas abaixo e pare ao encontrar Pera:
var fruitList = ['Banana', 'Maça', 'Pera', 'Uva', 'Melância'];
for(var i = 0; i < fruitList. length; i++){
    if(fruitList[i] === "Pera"){
        break;
    }else{
        console.log(fruitList[i]);
    }
}
//Coloque a última fruta do array em uma variável, sem remover a mesma da array, depois imprima essa variável no console:
var lastFruit = fruitList[4];

console.log(lastFruit);