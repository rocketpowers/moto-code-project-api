const formulario = document.querySelector("form");

const Iname = document.querySelector(".name");
const Iemail = document.querySelector(".email");
const Ipassword = document.querySelector(".password");
const Iphone = document.querySelector(".phone");

function register () {

    fetch("http://localhost:8080/register",
   {
headers:{

    'Accept': 'aplication/json',
    'Content-Type': 'aplication/json'
},

method:"POST",
body: JSON.stringify({

        name: Iname.value,
        email: Iemail.value,
        password: Ipassword.value,
        phone: Iphone.value
})

   }) 
   .then(function (res) {console.log(res) })
   .catch(function (res) {console.log(res)})

};

function clean(){
    Iname.value="";
    Iemail.value="";
    Ipassword.value="";
    Iphone.value="";

};


formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    register();
    clean();
    
});
