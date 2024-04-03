// Ao clicar no botão + deve ser adicionado um novo grupo para adicionar um telefone
// Ao clicar no botão Novo contato a classe btn-primary deve ser substituida por btn-success

//Questão 01:
let telephoneArea = document.querySelector(".phoneGroup");
let buttonAdd = document.querySelector(".btn-add");
let buttonArea = document.querySelector(".col-md-1");
let form = document.querySelector("form");

buttonAdd.addEventListener("click", clonarCampo);

function clonarCampo(event){
    event.preventDefault();
    let cloneTelephoneArea = telephoneArea.cloneNode(true);
    form.insertBefore(cloneTelephoneArea, ultimaDiv);
    let cloneButtonAdd = buttonArea.cloneNode(true);
    form.insertBefore(cloneButtonAdd, ultimaDiv);
    cloneButtonAdd.addEventListener("click", clonarCampo)
}

//Questão 02:
let buttonNewContact = document.querySelector("#newContact");
let listDiv = document.querySelectorAll("div");
let ultimaDiv = listDiv[12];
let buttonNewContactArea = document.querySelector(".col-12");

buttonNewContact.addEventListener("click", event =>{
    event.preventDefault();
    buttonNewContact.classList.replace("btn-primary", "btn-sucess");
})
