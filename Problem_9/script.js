
    const registeredUsers = {
        
    };

    function login() {
        const email = document.getElementById("email").value;
        const password = document.getElementById("password").value;

        if (email in registeredUsers) {
            if (password === registeredUsers[email]) {
                document.getElementById("email").value = "";
                document.getElementById("password").value = "";
                alert("Login successful!");
            } else {
                alert("Incorrect password. Please try again.");
            }
        } else {
            alert("Email not found. Please sign up first.");
        }
    }

   
    function validateEmail(email) {
        const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
        return emailRegex.test(email);
    }

    // Function to validate password format
    function validatePassword(password) {
        const passwordRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}$/;
        return passwordRegex.test(password);
    }

    // Function to handle signup
    function signUp() {
        const email = document.getElementById("email").value;
        const password = document.getElementById("password").value;

        if (!validateEmail(email)) {
            alert("Invalid email format. Please enter a valid email address.");
        } else if (!validatePassword(password)) {
            alert("Invalid password format. Password should be at least 6 characters long and contain at least one number, one lowercase, and one uppercase letter.");
        } else if (email in registeredUsers) {
            alert("Email already exists. Please use a different email.");
        } else {
            // Store user data with email as the key and password as the value
            registeredUsers[email] = password;
            // Clear the input fields
            document.getElementById("email").value = "";
            document.getElementById("password").value = "";
            // Display a success alert
            alert("Signup successful!");
        }
    }

  
