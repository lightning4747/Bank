document.addEventListener("DOMcontentLoaded", 
    function (e) {
   const login = document.querySelector("#login-login");

   if(login) {
    login.addEventListener("submit", loginform);
   }
   const singup = document.querySelector("submit", signup)


    function loginform(e) {
        e.preventDefault();

        const input = [...e.target.querySelector("input")];

        inputs.forEach(input => input.style.border = input.value.trim() ? "2px solid green" : "2px solid red");
        
        if(input.every(input => input.value.trim())) { alert("hehe"); }
           
       
        else  {alert("Invalid");  }
    }
    function signup(e) {
        e.preventDefault();

       const form = e.target;
       const name = form.querySelector("#name");
       const accname = form.querySelector("#account-name");
       const accnumber = form.querySelector("#account-number");
       const phone = form.querySelector("#number");
       const mail = form.querySelector("#mail");
       const birth = form.querySelector("#birth");
       const pass = form.querySelector("#pass");
       const confirm = form.querySelector("#c");

       let allvalid = true;
        const input = [...e.target.querySelector("input")];

        inputs.forEach(input => input.style.border = input.value.trim() ? "2px solid green" : "2px solid red");
        
        if(input.every(input => input.value.trim())) { alert("hehe"); }
           
       
        else  {alert("Invalid"); allvalid= false;  }

       if(!(pass === confirm)) {
        alert("password does not matches, try again");
        allvalid = false;
       }

           
    }

});
