let fieldCEP = document.querySelector("#cep");
let searchButton = document.querySelector("#buscar");
let text = document.querySelector("#resposta");

searchButton.addEventListener("click", event =>{
    event.preventDefault();
    consumirAPI();
});


/*function consumirAPI() {
    fetch(`https://viacep.com.br/ws/${fieldCEP.value}/json/`)
    .then(response =>{
        return response.json();
    }).then(data =>{
        text.innerHTML = `<h1>Cidade: ${data.localidade}</h1>
                          <h2>Bairro: ${data.bairro}</h2>
                          <h2>UF: ${data.uf}</h2>`;
    })
}*/

async function consumirAPI() {
    const response = await fetch(`https://viacep.com.br/ws/${fieldCEP.value}/json/`)
    const data = await response.json();
    text.innerHTML = `<h1>Cidade: ${data.localidade}</h1>
                          <h2>Bairro: ${data.bairro}</h2>
                          <h2>UF: ${data.uf}</h2>`;
}