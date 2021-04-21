let nome = window.document.getElementById("nome");
let email = window.document.querySelector("#email");
let mensagem = document.querySelector("#mensagem");
let img = document.querySelector('.img');
let emailOk = false;
let mensagemOk = false;


nome.style.width = '100%';
email.style.width = '100%';

function validaNome(){
    let txt = document.querySelector('#txtNome');
    if(nome.value.length < 3){
        txt.innerHTML = 'Digite mais caracteres';
        txt.style.color = 'red';
    }else{
        txt.innerHTML = 'Nome Válido';
        txt.style.color = 'blue';
        nomeOk = true;
    }
}

function validaEmail(){
    let txt = document.querySelector('#txtEmail');
    if(email.value.indexOf('@')==-1 || email.value.indexOf('.')==-1){
        txt.innerHTML = 'Forneça um e-mail no formato exemplo@exemplo.com';
        txt.style.color = 'red';
    }else{
        txt.innerHTML = 'e-mail Válido';
        txt.style.color = 'blue';
        emailOk = true;
        let img = document.querySelector('#img');
    }
}

function validaMensagem(){
    let txt = document.querySelector('#txtMensagem')

    if(mensagem.value.length<100){
        txt.innerHTML = 'Máximo 100 caracteres';
        txt.style.color = 'blue';
        mensagemOk = true;
    }else{
        if(mensagem.value.length=100){
            txt.innerHTML = 'Máximo de caracteres atingido';
            txt.style.color = 'green';
            txt.style.display = 'block';
        }else{
           if(mensagem.value.length>100){
                txt.innerHTML = 'Máximo de caracteres excedido'
                txt.style.color = 'red';
           }
        }
    }
}

function enviar(){
    if(nomeOk == true && emailOk == true && mensagemOk == true){
        alert('Formulário enviado')
    }else{
        alert('Preencha os dados corretamente antes de enviar')
    }
}

function imgZoom(){
    img.style.width = '800px';
    img.style.height = '500px';
}

function imgOriginal(){
    img.style.width = '400px';
    img.style.height = '250px';
}