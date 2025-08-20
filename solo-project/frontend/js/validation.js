document.addEventListener("DOMContentLoaded", function () {
    const loginForm = document.querySelector("#login");
    const signupForm = document.querySelector("#signup");

    // Login handler
    if (loginForm) {
        loginForm.addEventListener("submit", function (e) {
            e.preventDefault();

            const inputs = [...loginForm.querySelectorAll("input")];
            
            // mark borders
            inputs.forEach(input => {
                input.style.border = input.value.trim()
                    ? "2px solid green"
                    : "2px solid red";
            });

            // check if all filled
            if (inputs.every(input => input.value.trim())) {
                alert("Login Successful (hehe 😏)");
            } else {
                alert("Fill all the boxes");
            }
        });
    }

    // Signup handler
    if (signupForm) {
        signupForm.addEventListener("submit", function (e) {
            e.preventDefault();

            const inputs = [...signupForm.querySelectorAll("input")];
            let allValid = true;

            inputs.forEach(input => {
                input.style.border = input.value.trim()
                    ? "2px solid green"
                    : "2px solid red";
            });

            if (!inputs.every(input => input.value.trim())) {
                alert("Fill all fields properly!");
                allValid = false;
            }

            const pass = signupForm.querySelector("#pass").value;
            const confirm = signupForm.querySelector("#c").value;

            if (pass !== confirm) {
                alert("Passwords do not match!");
                allValid = false;
            }

            if (allValid) {
                alert("Signup successful 🎉");
            }
        });
    }
});
