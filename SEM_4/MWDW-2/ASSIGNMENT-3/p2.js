let Button = document.getElementsByTagName('button')[0];
let output = document.getElementsByClassName('output')[0];

Button.addEventListener('click', () => {
    let email = document.getElementsByTagName('input')[0].value;
    let pattern = /([a-zA-Z0-9]+@[a-zA-Z0-9.-_]+\.[a-zA-Z0-9.-_]+)/;

    if (pattern.test(email)) {
        output.classList.add("valid")
        output.textContent = "Valid Email";
    } else {
        output.classList.add("invalid")
        output.textContent = "Invalid Email!";
    }
})