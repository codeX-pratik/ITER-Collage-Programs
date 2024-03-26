const output = document.getElementById('output');
const searchText = document.getElementById('sText');
const replaceText = document.getElementById('rText');
const Button = document.getElementById('rButton');

Button.addEventListener('click', lookUp);

function lookUp() {
    let s = output.textContent;
    let rt = searchText.value;
    
    let regex = new RegExp(rt, 'g');
    if (s.match(regex)) {
        output.textContent = s.replace(regex, replaceText.value);
    } else {
        alert("No Matching found");
    }
}