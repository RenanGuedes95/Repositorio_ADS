let botaoAumentar = document.getElementById('botaoAumentar');
let botaoDiminuir = document.getElementById('botaoDiminuir');

botaoAumentar.addEventListener("click", () => {
    if (document.body.classList.contains("texto-regular")) {
        document.body.classList.replace("texto-regular", "texto-grande");
    } else if (document.body.classList.contains("texto-pequeno")) {
        document.body.classList.replace("texto-pequeno", "texto-regular");
    }else{
        window.alert("Este é o maior tamanho possível!!");
    }
});

botaoDiminuir.addEventListener("click", () => {
    if(document.body.classList.contains("texto-regular")){
        document.body.classList.replace("texto-regular", "texto-pequeno");
    } else if(document.body.classList.contains("texto-grande")){
        document.body.classList.replace("texto-grande", "texto-regular");
    } else{
        window.alert("Este é o menor tamanho possível!!");
    }
});

