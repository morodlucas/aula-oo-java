
const campoForm = document.querySelectorAll("[required]");

campoForm.forEach((campo) => {
    campo.addEventListener("blur", () => validar(campo));
    
});

function validar(campo){
    if (campo.name == "cpf"){
        alert(campo.value);
    }
}